package tech.vladflore.designpatterns.factorymethod;

public abstract class Dialog {

    public void render(){
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
