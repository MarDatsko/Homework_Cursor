package com.homework4.task1.model;

import com.homework4.task1.abstra.SpaceShape;
import com.homework4.task1.abstra.Vertex;

import java.text.DecimalFormat;

public class Sphere extends SpaceShape {

    private Vertex3D vertex_A;
    private double radius;
    private boolean isRadiusCorrect = true;

    public Sphere(Vertex vertex, double radius) {
        this.vertex_A = (Vertex3D)vertex;
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
            return Double.parseDouble(formatter.format(4.0 * Math.PI * Math.pow(radius, 2)));
        }
        return 0;
    }

    @Override
    public double getVolume() {
        if (isRadiusCorrect) {
            DecimalFormat formatter = new DecimalFormat("#0.00");
            return Double.parseDouble(formatter.format(((4.0 / 3.0) * Math.PI) * Math.pow(radius, 3)));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Sphere vertex : " + "A " + vertex_A.toString() + '\n'
                + "Sphere volume = " + getVolume() + "   " + "Sphere area = " + getArea() + '\n';
    }
}
