package com.homework4.task1.model;

import com.homework4.task1.abstracts.Shape;
import com.homework4.task1.abstracts.Vertex;

public class ProgramRuner {
    public void runProgram() {
        Vertex vertexTriangle_A = new Vertex2D(-3, 4);
        Vertex vertexTriangle_B = new Vertex2D(1, -2);
        Vertex vertexTriangle_C = new Vertex2D(5, 5);
        Shape triangle = new Triangle(vertexTriangle_A, vertexTriangle_B, vertexTriangle_C);

        Vertex vertexRectangle_A = new Vertex2D(4, 9);
        Shape rectangle = new Rectangle(vertexRectangle_A, 6, 9);

        Vertex vertexCircle_A = new Vertex2D(-7, 7);
        Shape circle = new Circle(vertexCircle_A, 5);

        Vertex vertexSphere_A = new Vertex3D(3, -2, 16);
        Shape sphere = new Sphere(vertexSphere_A, 10);

        Vertex vertexCuboid_A = new Vertex3D(3, -2, 1);
        Shape cuboid = new Cuboid(vertexCuboid_A, 10, 11, 6);

        Vertex vertexSquarePyramid_A = new Vertex3D(3, -2, 17);
        Shape squarePyramid = new SquarePyramid(vertexSquarePyramid_A, 13, 18);

        Shape[] array = {triangle, rectangle, circle, sphere, cuboid, squarePyramid};
        for (Shape x : array) {
            System.out.println(x.toString());
        }
    }
}
