package com.homework4.task1.model;

import com.homework4.task1.abstracts.SpaceShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class SquarePyramid extends SpaceShape {
    private double pyramidHeight;
    private double baseSide;
    private boolean isNumberCorrect = true;

    public SquarePyramid(Vertex vertex, double pyramidHeight, double baseSide) {
        super(vertex);
        if (pyramidHeight <= 0) {
            System.out.println("Pyramid height cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.pyramidHeight = pyramidHeight;
        }
        if (baseSide <= 0) {
            System.out.println("Base side cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.baseSide = baseSide;
        }
    }

    @Override
    public double calculateArea() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        double lateral_area = baseSide * Math.sqrt((4.0 * Math.pow(pyramidHeight, 2) + Math.pow(baseSide, 2)));
        return isNumberCorrect ? Double.parseDouble(formatter.format(lateral_area + Math.pow(baseSide, 2))) : 0;
    }

    @Override
    public double calculateVolume() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isNumberCorrect ? Double.parseDouble(formatter.format((1.0 / 3.0) * Math.pow(baseSide, 2) * pyramidHeight)) : 0;
    }

    @Override
    public String toString() {
        return "Square Pyramid vertex : " + "A " + getVertexA().toString() + '\n'
                + "Square Pyramid volume = " + calculateVolume() + "   " + "Square Pyramid sur face area = " + calculateArea() + '\n';
    }
}
