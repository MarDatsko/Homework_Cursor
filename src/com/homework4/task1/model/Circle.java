package com.homework4.task1.model;

import com.homework4.task1.abstracts.PlaneShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class Circle extends PlaneShape {
    private double radius;
    private boolean isRadiusCorrect = true;

    public Circle(Vertex vertex, double radius) {
        super(vertex);
        if (radius <= 0) {
            System.out.println("Radius cannot be 0 or negative number ");
            isRadiusCorrect = false;
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isRadiusCorrect ? Double.parseDouble(formatter.format(Math.PI * Math.pow(radius, 2))) : 0;
    }

    @Override
    public double calculatePerimeter() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isRadiusCorrect ? Double.parseDouble(formatter.format(2.0 * Math.PI * radius)) : 0;
    }

    @Override
    public String toString() {
        return "Circle vertex : " + "A " + getVertexA().toString() + '\n'
                + "Circle perimeter = " + calculatePerimeter() + "   " + "Circle area = " + calculateArea() + '\n';
    }
}
