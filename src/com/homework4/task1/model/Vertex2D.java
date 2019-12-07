package com.homework4.task1.model;

import com.homework4.task1.abstra.Vertex;

public class Vertex2D extends Vertex {
    private double x;
    private double y;

    public Vertex2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
