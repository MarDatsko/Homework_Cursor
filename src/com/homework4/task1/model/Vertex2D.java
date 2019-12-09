package com.homework4.task1.model;

import com.homework4.task1.abstracts.Vertex;

public class Vertex2D extends Vertex {
    private double x;
    private double y;

    public Vertex2D(double x, double y) {
        super(x, y);
    }

    public double getX() {
        return super.getX();
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return super.getY();
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
