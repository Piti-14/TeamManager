package View;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());

        //Adding the menu bar
        MenuBar menu = new MenuBar();
        add(menu, BorderLayout.NORTH);

        //Adding the main button's panel
        JPanel initialPanel = new JPanel();

        JButton player = new JButton("Enter new player");
        JButton team = new JButton("Enter new team");
        JButton results = new JButton("Show results");

        initialPanel.add(player);
        initialPanel.add(team);
        initialPanel.add(results);
        add(initialPanel, BorderLayout.CENTER);
    }
}
