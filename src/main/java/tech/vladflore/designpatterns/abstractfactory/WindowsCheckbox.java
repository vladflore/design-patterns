package tech.vladflore.designpatterns.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint Windows Checkbox");
    }
}
