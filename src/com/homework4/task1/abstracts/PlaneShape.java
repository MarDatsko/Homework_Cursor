package com.homework4.task1.abstracts;

import com.homework4.task1.interfaces.AreaMeasurable;
import com.homework4.task1.interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShape(Vertex vertexA) {
        super(vertexA);
    }

    public Vertex getVertexA() {
        return super.getVertexA();
    }

    public void setVertexA(Vertex vertexA) {
        super.setVertexA(vertexA);
    }

}
