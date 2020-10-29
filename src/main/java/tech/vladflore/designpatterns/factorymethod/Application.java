package tech.vladflore.designpatterns.factorymethod;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}
