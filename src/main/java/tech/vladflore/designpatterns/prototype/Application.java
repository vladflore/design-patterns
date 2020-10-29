package tech.vladflore.designpatterns.prototype;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setOriginX(0);
        rectangle.setOriginY(0);
        rectangle.setW(100);
        rectangle.setH(50);
        rectangle.setColor("red");
        System.out.println(rectangle);

        Circle circle = new Circle();
        circle.setOriginX(0);
        circle.setOriginY(0);
        circle.setR(25);
        System.out.println(circle);

        Rectangle cloneRectangle = (Rectangle) rectangle.clone();
        Circle cloneCircle = (Circle) circle.clone();

        System.out.println(cloneRectangle);
        System.out.println(cloneCircle);
    }
}
