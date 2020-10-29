package tech.vladflore.designpatterns.factorymethod;

public class HTMLButton implements Button {
    public void render() {
        System.out.println("Render HTML button");
    }

    public void onClick() {
        System.out.println("Click on HTML button");
    }
}
