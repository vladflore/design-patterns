package tech.vladflore.designpatterns.abstractfactory;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
