package com.solvd.patterns.factory_method.button;

import com.solvd.patterns.factory_method.OSType;

public class LinuxButton extends Button {

    public LinuxButton(String name) {
        super(name);
    }

    @Override
    public OSType getType() {
        return OSType.LINUX;
    }

    @Override
    public void click() {
        System.out.println(this.getName() + "was clicked");
    }
}
