package factory_method.button;

import factory_method.OSType;

public abstract class Button {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    public abstract OSType getType();

    public abstract void click();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
