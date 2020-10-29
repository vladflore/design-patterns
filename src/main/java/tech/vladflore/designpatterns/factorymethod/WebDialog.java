package tech.vladflore.designpatterns.factorymethod;

public class WebDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}
