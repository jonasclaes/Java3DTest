package be.jonasclaes.Java3DTest;

import java.awt.*;

public class Triangle {
    public Vertex v1;
    public Vertex v2;
    public Vertex v3;
    public Color color;
    public String name;

    public Triangle(Vertex v1, Vertex v2, Vertex v3, Color color, String name) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.color = color;
        this.name = name;
    }
}
