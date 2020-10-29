package tech.vladflore.designpatterns.prototype;

public abstract class Shape {
    private int originX;
    private int originY;
    private String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.originX = source.originX;
        this.originY = source.originY;
        this.color = source.color;
    }

    public abstract Shape clone();

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
