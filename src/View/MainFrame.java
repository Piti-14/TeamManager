package View;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setBounds(200, 200, 300, 200);

        MainPanel principal = new MainPanel();
        add(principal);

        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
