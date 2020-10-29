package tech.vladflore.designpatterns.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint Mac Checkbox");
    }
}
