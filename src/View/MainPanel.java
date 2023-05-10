package View;

import Controller.MainPanelController;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());

        //Creating the secondary panels
        PlayerPanel newPlayer = new PlayerPanel();
        TeamPanel newTeam = new TeamPanel();
        //add more panels later maybe...

        //Adding the menu bar
        MenuBar menu = new MenuBar();
        add(menu, BorderLayout.NORTH);

        //Adding the main button's panel
        JPanel initialPanel = new JPanel();

        JButton player = new JButton("Enter new player");
        JButton team = new JButton("Enter new team");
        JButton results = new JButton("Show results");

        player.addActionListener(e -> MainPanelController.newActivePanel(newPlayer));
        team.addActionListener(e -> MainPanelController.newActivePanel(newTeam));

        //Adding a controller
        JPanel test = new JPanel();
        MainPanelController controller = new MainPanelController(this, initialPanel);

        initialPanel.add(player);
        initialPanel.add(team);
        initialPanel.add(results);
        add(initialPanel, BorderLayout.CENTER);

    }
}
