package com.homework4.task1.model;

import com.homework4.task1.abstra.SpaceShape;
import com.homework4.task1.abstra.Vertex;

import java.text.DecimalFormat;

public class SquarePyramid extends SpaceShape {
    private Vertex3D vertex_A;
    private double pyramid_height;
    private double base_side;
    private boolean isNumberCorrect = true;

    public SquarePyramid(Vertex vertex, double pyramid_height, double base_side) {
        this.vertex_A = (Vertex3D)vertex;
        if (pyramid_height <= 0) {
            System.out.println("Pyramid height cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.pyramid_height = pyramid_height;
        }
        if (base_side <= 0) {
            System.out.println("Base side cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.base_side = base_side;
        }
    }

    @Override
    public double getArea() {
        if (isNumberCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            double lateral_area = base_side * Math.sqrt((4.0 * Math.pow(pyramid_height, 2) + Math.pow(base_side, 2)));
            return Double.parseDouble(formatter.format(lateral_area + Math.pow(base_side, 2)));
        }
        return 0;
    }

    @Override
    public double getVolume() {
        if (isNumberCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format((1.0 / 3.0) * Math.pow(base_side, 2) * pyramid_height));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Square Pyramid vertex : " + "A " + vertex_A.toString() + '\n'
                + "Square Pyramid volume = " + getVolume() + "   " + "Square Pyramid sur face area = " + getArea() + '\n';
    }
}
