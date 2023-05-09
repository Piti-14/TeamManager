import View.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MainFrame myWindow = new MainFrame();
    }
}




class PlayerPanel extends JPanel {
    public PlayerPanel() {
        JTextField position = new JTextField("Position: ");
        add(position);

        JTextField name = new JTextField("Name: ");
        add(position);

        JTextField year = new JTextField("Year: ");
        add(position);

        JTextField height = new JTextField("Height: ");
        add(position);

        JTextField number = new JTextField("Number: ");
        add(position);

        JTextField club = new JTextField("Club: ");
        add(position);
    }
}