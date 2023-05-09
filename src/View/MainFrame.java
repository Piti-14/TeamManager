package View;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setBounds(200, 200, 600, 600);

        MainPanel principal = new MainPanel();
        add(principal);

        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
