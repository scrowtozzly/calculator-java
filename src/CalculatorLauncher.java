import javax.swing.*;

public class CalculatorLauncher {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {   
                new BuildCalculatorGUI().setVisible(true);
            }
        });
    }
}
