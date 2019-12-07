package com.homework4.task1.model;

import com.homework4.task1.abstra.PlaneShape;
import com.homework4.task1.abstra.Vertex;

import java.text.DecimalFormat;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex_A;
    private double width;
    private double height;
    private boolean isCorrectNumber = true;

    public Rectangle(Vertex a, double width, double height) {
        this.vertex_A = (Vertex2D)a;
        if (width <= 0) {
            System.out.println("Width cannot be 0 or negative number ");
            isCorrectNumber = false;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            System.out.println("Height cannot be 0 or negative number ");
            isCorrectNumber = false;
        } else {
            this.height = height;
        }

    }

    @Override
    public double getArea() {
        if (isCorrectNumber) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(width * height));
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (isCorrectNumber) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(2 * (width + height)));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle vertex : " + "A " + vertex_A.toString() + '\n'
                + "Rectangle perimeter = " + getPerimeter() + "   " + "Rectangle area = " + getArea() + '\n';
    }
}
