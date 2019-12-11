package com.homework4.task1.abstracts;

import com.homework4.task1.interfaces.AreaMeasurable;
import com.homework4.task1.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    public SpaceShape(Vertex vertex) {
        super(vertex);
    }

    public Vertex getVertexA() {
        return super.getVertexA();
    }

    public void setVertexA(Vertex vertexA) {
        super.setVertexA(vertexA);
    }
}
