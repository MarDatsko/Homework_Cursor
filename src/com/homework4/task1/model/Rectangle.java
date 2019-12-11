package com.homework4.task1.model;

import com.homework4.task1.abstracts.PlaneShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;
    private boolean isCorrectNumber = true;

    public Rectangle(Vertex a, double width, double height) {
        super(a);
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
    public double calculateArea() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isCorrectNumber ? Double.parseDouble(formatter.format(width * height)) : 0;

    }

    @Override
    public double calculatePerimeter() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isCorrectNumber ? Double.parseDouble(formatter.format(2 * (width + height))) : 0;

    }

    @Override
    public String toString() {
        return "Rectangle vertex : " + "A " + getVertexA().toString() + '\n'
                + "Rectangle perimeter = " + calculatePerimeter() + "   " + "Rectangle area = " + calculateArea() + '\n';
    }
}
