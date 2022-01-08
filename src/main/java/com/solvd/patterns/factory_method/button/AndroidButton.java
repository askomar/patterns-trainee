package com.solvd.patterns.factory_method.button;

import com.solvd.patterns.factory_method.OSType;

public class AndroidButton extends Button {

    public AndroidButton(String name) {
        super(name);
    }

    @Override
    public OSType getType() {
        return OSType.ANDROID;
    }

    @Override
    public void click() {
        System.out.println(this.getName() + "was clicked");
    }
}
