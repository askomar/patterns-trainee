package com.solvd.patterns.factory_method.button;

import com.solvd.patterns.factory_method.OSType;

public class MacButton extends Button {

    public MacButton(String name) {
        super(name);
    }

    @Override
    public OSType getType() {
        return OSType.MACOS;
    }

    @Override
    public void click() {
        System.out.println(this.getName() + "was clicked");
    }
}
