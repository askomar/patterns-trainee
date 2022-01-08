package com.solvd.patterns.factory_method;

import com.solvd.patterns.factory_method.button.*;

public class ButtonFactory {

    public static Button createButton(String name, OSType buttonType) {
        switch (buttonType) {
            case WINDOWS:
                return new WindowButton(name);
            case MACOS:
                return new MacButton(name);
            case LINUX:
                return new LinuxButton(name);
            case ANDROID:
                return new AndroidButton(name);
            default:
                throw new RuntimeException("There are no such OSType");
        }
    }
}
