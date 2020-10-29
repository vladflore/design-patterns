package tech.vladflore.designpatterns.prototype;

public class Rectangle extends Shape {

    private int w;
    private int h;

    public Rectangle() {
        super();
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.w = source.w;
        this.h = source.h;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
