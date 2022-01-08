package com.solvd.patterns.factory_method.button;

import com.solvd.patterns.factory_method.OSType;

public class WindowButton extends Button {

    public WindowButton(String name) {
        super(name);
    }

    @Override
    public OSType getType() {
        return OSType.WINDOWS;
    }

    @Override
    public void click() {
        System.out.println(this.getName() + "was clicked");
    }
}
