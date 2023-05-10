package Controller;

import View.MainPanel;
import View.PlayerPanel;

import javax.swing.*;

public class MainPanelController {
    static JPanel parentPanel, activePanel;
    public MainPanelController(JPanel panel1, JPanel panel2){
        parentPanel = panel1;
        activePanel = panel2;

        parentPanel.add(activePanel);
    }
    public static void newActivePanel(JPanel newPanel){
        parentPanel.remove(activePanel);
        parentPanel.add(newPanel);
        parentPanel.revalidate();
        parentPanel.repaint();

        activePanel = newPanel;
    }
}
