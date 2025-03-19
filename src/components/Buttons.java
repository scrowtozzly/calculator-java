package components;

import javax.swing.*;
import java.awt.event.*;

import components.Display;
import variables.Common;

public class Buttons {
    public static void buildButtonComponents() {
        for (String text : Common.BUTTON_CONTENT) {
            JButton button = new JButton(text);
            button.addActionListener(e-> handleButtonClick(text));
            Display.panel.add(button);
        }
    }
    private static void handleButtonClick(String text) {

    }
}
