package com.homework4.task1.model;

import com.homework4.task1.abstracts.PlaneShape;
import com.homework4.task1.abstracts.Vertex;
import java.text.DecimalFormat;

public class Triangle extends PlaneShape {
    private Vertex vertexB ;
    private Vertex vertexC ;
    double sizeSideA ;
    double sizeSideB ;
    double sizeSideC ;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        super(a);
        this.vertexB = b;
        this.vertexC = c;
        findSizeAllSide();
    }

    private double findSizeOneSide(Vertex a, Vertex b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    private void findSizeAllSide(){
        this.sizeSideA = findSizeOneSide(getVertexA(), vertexB);
        this.sizeSideB = findSizeOneSide(vertexB, vertexC);
        this.sizeSideC = findSizeOneSide(vertexC, getVertexA());
    }
    @Override
    public double calculatePerimeter() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(sizeSideA + sizeSideB + sizeSideC));
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(Math.sqrt(p * (p - sizeSideA) * (p - sizeSideB) * (p - sizeSideC))));
    }

    @Override
    public String toString() {
        return "Triangle vertices : " + "A " + getVertexA().toString() + "  B " + vertexB.toString() + "  C " + vertexC.toString() + '\n'
                + "Triangle perimeter = " + calculatePerimeter() + "   " + "Triangle area = " + calculateArea() + '\n';
    }
}
