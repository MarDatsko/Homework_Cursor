package com.homework4.task1.model;

import com.homework4.task1.abstracts.SpaceShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class Sphere extends SpaceShape {
    private double radius;
    private boolean isRadiusCorrect = true;

    public Sphere(Vertex vertex, double radius) {
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
        return isRadiusCorrect ? Double.parseDouble(formatter.format(4.0 * Math.PI * Math.pow(radius, 2))) : 0;
    }

    @Override
    public double calculateVolume() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return isRadiusCorrect ? Double.parseDouble(formatter.format(((4.0 / 3.0) * Math.PI) * Math.pow(radius, 3))) : 0;
    }

    @Override
    public String toString() {
        return "Sphere vertex : " + "A " + getVertexA().toString() + '\n'
                + "Sphere volume = " + calculateVolume() + "   " + "Sphere area = " + calculateArea() + '\n';
    }
}
