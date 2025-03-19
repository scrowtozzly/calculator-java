package components;

import components.Buttons;
import components.Display;

@SuppressWarnings("unused")
public class Build {
    public static void addComponents() {
        Buttons.buildButtonComponents();
        Display.addDisplay();
    }
}