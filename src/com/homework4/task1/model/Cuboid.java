package com.homework4.task1.model;

import com.homework4.task1.abstracts.SpaceShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;
    private boolean isNumberCorrect = true;

    public Cuboid(Vertex vertex, double width, double height, double depth) {
        super(vertex);
        if (width <= 0) {
            System.out.println("Width cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            System.out.println("Height cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.height = height;
        }
        if (depth <= 0) {
            System.out.println("Depth cannot be 0 or negative number ");
            isNumberCorrect = false;
        } else {
            this.depth = depth;
        }
    }

    @Override
    public double calculateArea() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isNumberCorrect ? Double.parseDouble(formatter.format(2.0 * ((depth * width) + (width * height) + (height * depth)))) : 0;
    }

    @Override
    public double calculateVolume() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isNumberCorrect ? Double.parseDouble(formatter.format(width * depth * height)) : 0;

    }

    @Override
    public String toString() {
        return "Cuboid vertex : " + "A " + getVertexA().toString() + '\n'
                + "Cuboid volume = " + calculateVolume() + "   " + "Cuboid area = " + calculateArea() + '\n';
    }
}
