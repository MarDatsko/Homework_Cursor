package com.homework4.task1.abstracts;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertex) {
        this.vertexA = vertex;
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }
}
