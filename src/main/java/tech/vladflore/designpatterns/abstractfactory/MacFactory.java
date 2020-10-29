package tech.vladflore.designpatterns.abstractfactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButon();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
