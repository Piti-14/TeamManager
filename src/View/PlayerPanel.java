package View;

import javax.swing.*;

public class PlayerPanel extends JPanel {
    JTextField position, name, year, height, number, club;

    public PlayerPanel() {
        position = new JTextField("Position: ",10);
        name = new JTextField("Name: ", 15);
        year = new JTextField("Birth year: ", 4);
        height = new JTextField("Height: ", 3);
        number = new JTextField("Back number: ", 3);
        club = new JTextField("Club: ", 15);

        add(position);
        add(name);
        add(year);
        add(height);
        add(number);
        add(club);

        JButton addPlayer = new JButton("Add");
        //addPlayer.addActionListener(e -> PlayerController.addPlayer(this));
        add(addPlayer);
    }
}
