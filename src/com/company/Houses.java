package com.company;

public abstract class Houses implements Printable  {
    private int height;
    private int width;
    private String name;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    public Houses(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;

    }
}
