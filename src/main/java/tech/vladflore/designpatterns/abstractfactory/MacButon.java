package tech.vladflore.designpatterns.abstractfactory;

public class MacButon implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Mac Button");
    }
}
