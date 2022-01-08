package factory_method;

import factory_method.button.Button;

import java.util.List;

/**
 * Мы можем использовать фабричный метод, когда при тестировании нам нужно порождать
 * множество разных объеектов с единым интерфейсом, и мы хотим поместить создание этих объектов
 * в одном методе (классе)
 */
public class Main {

    public static void main(String[] args) {
        List<Button> buttons = List.of(
                ButtonFactory.createButton("first", OSType.WINDOWS),
                ButtonFactory.createButton("second", OSType.LINUX),
                ButtonFactory.createButton("third", OSType.ANDROID)
        );
        buttons.forEach(Button::click);
    }
}
