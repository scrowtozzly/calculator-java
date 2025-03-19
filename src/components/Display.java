package components;

import javax.swing.*;
import java.awt.*;

public class Display {
    public static final JPanel panel = new JPanel();

    public static void addDisplay() {
        panel.setLayout(new GridLayout(4, 4, 5, 5));
    }
}
