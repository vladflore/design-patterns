package tech.vladflore.designpatterns.abstractfactory;

public class Application {

    private final GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        new Application(new WindowsFactory()).createUI();
        new Application(new MacFactory()).createUI();
    }
}
