package tech.vladflore.designpatterns.factorymethod;

public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}
