package com.homework4.task1.model;

import com.homework4.task1.abstra.SpaceShape;
import com.homework4.task1.abstra.Vertex;

import java.text.DecimalFormat;

public class Cuboid extends SpaceShape {
    private Vertex3D vertex_A;
    private double width;
    private double height;
    private double depth;
    private boolean isNumberCorrect = true;

    public Cuboid(Vertex vertex, double width, double height, double depth) {
        this.vertex_A = (Vertex3D)vertex;
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
    public double getArea() {
        if (isNumberCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(2.0 * ((depth * width) + (width * height) + (height * depth))));
        }
        return 0;
    }

    @Override
    public double getVolume() {
        if (isNumberCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(width * depth * height));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cuboid vertex : " + "A " + vertex_A.toString() + '\n'
                + "Cuboid volume = " + getVolume() + "   " + "Cuboid area = " + getArea() + '\n';
    }
}
