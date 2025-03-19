import variables.Common;
import components.Build;
import components.Display;
import javax.swing.*;

class BuildCalculatorGUI extends JFrame {
    public BuildCalculatorGUI() {
        super("Calculator Application");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // só pode fechar se apertar no xis
        setSize(Common.APP_SIZE[0], Common.APP_SIZE[1]); // tamanho da janela
        setLocationRelativeTo(null); // começa a janela no centro
        setResizable(false); // nao quero deixar essa $%$@# responsiva :)   

        add(Display.panel);
        Build.addComponents();
    }
}