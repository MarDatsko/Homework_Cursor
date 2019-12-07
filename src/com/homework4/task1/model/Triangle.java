package com.homework4.task1.model;

import com.homework4.task1.abstra.PlaneShape;
import com.homework4.task1.abstra.Vertex;
import java.text.DecimalFormat;

public class Triangle extends PlaneShape {
    private Vertex2D vertexA;
    private Vertex2D vertexB;
    private Vertex2D vertexC;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        this.vertexA = (Vertex2D)a;
        this.vertexB = (Vertex2D)b;
        this.vertexC = (Vertex2D)c;
    }

    private double findSizeSide(Vertex2D a, Vertex2D b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    @Override
    public double getPerimeter() {
        double sizeSideA = findSizeSide(vertexA, vertexB);
        double sizeSideB = findSizeSide(vertexB, vertexC);
        double sizeSideC = findSizeSide(vertexC, vertexA);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(sizeSideA + sizeSideB + sizeSideC));
    }

    @Override
    public double getArea() {
        double sizeSideA = findSizeSide(vertexA, vertexB);
        double sizeSideB = findSizeSide(vertexB, vertexC);
        double sizeSideC = findSizeSide(vertexC, vertexA);
        double p = getPerimeter() / 2;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(Math.sqrt(p * (p - sizeSideA) * (p - sizeSideB) * (p - sizeSideC))));
    }

    @Override
    public String toString() {
        return "Triangle vertices : " + "A " + vertexA.toString() + "  B " + vertexB.toString() + "  C " + vertexC.toString() + '\n'
                + "Triangle perimeter = " + getPerimeter() + "   " + "Triangle area = " + getArea() + '\n';
    }
}
