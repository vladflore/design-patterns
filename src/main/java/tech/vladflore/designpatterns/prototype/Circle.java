package tech.vladflore.designpatterns.prototype;

public class Circle extends Shape {

    private int r;

    public Circle() {
        super();
    }

    public Circle(Circle source) {
        super(source);
        this.r = source.r;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
