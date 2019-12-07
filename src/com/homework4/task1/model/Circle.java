package com.homework4.task1.model;

import com.homework4.task1.abstra.PlaneShape;
import com.homework4.task1.abstra.Vertex;

import java.text.DecimalFormat;

public class Circle extends PlaneShape {
    private Vertex2D vertex_A;
    private double radius;
    private boolean isRadiusCorrect = true;

    public Circle(Vertex vertex, double radius) {
        this.vertex_A = (Vertex2D)vertex;
        if (radius <= 0) {
            System.out.println("Radius cannot be 0 or negative number ");
            isRadiusCorrect = false;
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        if (isRadiusCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(Math.PI * Math.pow(radius, 2)));
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (isRadiusCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(2.0 * Math.PI * radius));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Circle vertex : " + "A " + vertex_A.toString() + '\n'
                + "Circle perimeter = " + getPerimeter() + "   " + "Circle area = " + getArea() + '\n';
    }
}
