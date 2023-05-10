package View;

import javax.swing.*;

public class TeamPanel extends JPanel {
    JTextField country, competition, trainer;
    JLabel place, league, boss;

    public TeamPanel() {
        setLayout(new SpringLayout());

        place = new JLabel("Country: ");
        country = new JTextField(10);

        league = new JLabel("League: ");
        competition = new JTextField(20);

        boss = new JLabel("Trainer: ");
        trainer = new JTextField(15);

        add(country);
        add(competition);
        add(trainer);

        JButton addTeam = new JButton("Add");
        //addTeam.addActionListener(e -> TeamController.addTeam(this));
        add(addTeam);
    }
}
