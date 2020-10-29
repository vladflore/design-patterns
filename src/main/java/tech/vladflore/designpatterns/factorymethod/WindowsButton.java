package tech.vladflore.designpatterns.factorymethod;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows button");
    }

    public void onClick() {
        System.out.println("Click on Windows button");
    }
}
