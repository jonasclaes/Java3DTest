package be.jonasclaes.Java3DTest;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Beam {
    private Triangle XYF1;
    private Triangle XYF2;
    private Triangle ZYR1;
    private Triangle ZYR2;
    private Triangle XZT1;
    private Triangle XZT2;
    private Triangle XYB1;
    private Triangle XYB2;
    private Triangle ZYL1;
    private Triangle ZYL2;
    private Triangle XZB1;
    private Triangle XZB2;

    public Beam(int x, int y, int z, int width, int length, int height) {
        // Side XY front
        // Top triangle
        XYF1 = new Triangle(new Vertex(x, y, z),
                new Vertex(x, y - height, z),
                new Vertex(x - length, y - height, z),
                Color.CYAN,
                "");

        // Bottom triangle
        XYF2 = new Triangle(new Vertex(x, y, z),
                new Vertex(x - length, y - height, z),
                new Vertex(x - length, y, z),
                Color.CYAN,
                "");

        // Side ZY right
        // Top triangle
        ZYR1 = new Triangle(new Vertex(x - length, y, z + width),
                new Vertex(x - length, y - height, z + width),
                new Vertex(x - length, y - height, z),
                Color.YELLOW,
                "");

        // Bottom triangle
        ZYR2 = new Triangle(new Vertex(x - length, y, z + width),
                new Vertex(x - length, y - height, z),
                new Vertex(x - length, y, z),
                Color.YELLOW,
                "");

        // Side XZ top
        // Top triangle
        XZT1 = new Triangle(new Vertex(x, y - height, z + width),
                new Vertex(x, y - height, z),
                new Vertex(x - length, y - height, z),
                Color.RED,
                "");

        // Bottom triangle
        XZT2 = new Triangle(new Vertex(x, y - height, z + width),
                new Vertex(x - length, y - height, z),
                new Vertex(x - length, y - height, z + width),
                Color.RED,
                "");

        // Side XY back
        // Top triangle
        XYB1 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x, y - height, z + width),
                new Vertex(x - length, y - height, z + width),
                Color.GREEN,
                "");

        // Bottom triangle
        XYB2 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x - length, y - height, z + width),
                new Vertex(x - length, y, z + width),
                Color.GREEN,
                "");

        // Side ZY left
        // Top triangle
        ZYL1 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x, y - height, z + width),
                new Vertex(x, y - height, z),
                Color.MAGENTA,
                "");

        // Bottom triangle
        ZYL2 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x, y - height, z),
                new Vertex(x, y, z),
                Color.MAGENTA,
                "");

        // Side XZ bottom
        // Top triangle
        XZB1 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x, y, z),
                new Vertex(x - length, y, z),
                Color.WHITE,
                "");

        // Bottom triangle
        XZB2 = new Triangle(new Vertex(x, y, z + width),
                new Vertex(x - length, y, z),
                new Vertex(x - length, y, z + width),
                Color.WHITE,
                "");

    }

    public List<Triangle> getTriangleList() {
        List<Triangle> list = new ArrayList<>();
        list.add(XYF1);
        list.add(XYF2);
        list.add(ZYR1);
        list.add(ZYR2);
        list.add(XZT1);
        list.add(XZT2);
        list.add(XYB1);
        list.add(XYB2);
        list.add(ZYL1);
        list.add(ZYL2);
        list.add(XZB1);
        list.add(XZB2);
        return list;
    }
}
