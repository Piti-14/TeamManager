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
        MainPanelController controller = new MainPanelController(this, initialPanel);

        /*//Adding a controller for menu bar
        MainPanelController menuBarController = new MainPanelController(menu, initialPanel);*/

        JPanel buttons = new JPanel();
        buttons.add(player);
        buttons.add(team);
        buttons.add(results);

        initialPanel.add(buttons);
        add(initialPanel, BorderLayout.CENTER);
    }
}
