package View;

import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {
    JTextField country, competition, trainer;
    JLabel place, league, boss;

    public TeamPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints parameters = new GridBagConstraints();

        //Adding first element
        parameters.gridx = 0;
        parameters.gridy = 0;
        parameters.gridwidth = 1;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.NORTHWEST;
        parameters.fill = GridBagConstraints.NONE;

        place = new JLabel("Country: ");
        add(place, parameters);

        //Adding 2nd element
        parameters.gridx = 1;
        parameters.gridy = 0;
        parameters.gridwidth = 2;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.NORTHEAST;
        parameters.fill = GridBagConstraints.BOTH;

        country = new JTextField(20);
        add(country, parameters);

        //3rd element
        parameters.gridx = 0;
        parameters.gridy = 1;
        parameters.gridwidth = 1;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.WEST;

        league = new JLabel("League: ");
        add(league, parameters);

        //4th element
        parameters.gridx = 1;
        parameters.gridy = 1;
        parameters.gridwidth = 2;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.EAST;
        parameters.fill = GridBagConstraints.BOTH;

        competition = new JTextField(20);
        add(competition, parameters);

        //5th element
        parameters.gridx = 0;
        parameters.gridy = 2;
        parameters.gridwidth = 1;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.WEST;

        boss = new JLabel("Trainer: ");
        add(boss, parameters);

        //6th element
        parameters.gridx = 1;
        parameters.gridy = 2;
        parameters.gridwidth = 2;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.EAST;
        parameters.fill = GridBagConstraints.BOTH;

        trainer = new JTextField(20);
        add(trainer, parameters);

        //7th element
        parameters.gridx = 1;
        parameters.gridy = 3;
        parameters.gridwidth = 1;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.SOUTHEAST;
        parameters.fill = GridBagConstraints.VERTICAL;

        JButton addTeam = new JButton("Add ");
        add(addTeam, parameters);

        //8th element
        parameters.gridx = 1;
        parameters.gridy = 4;
        parameters.gridwidth = 1;
        parameters.gridheight = 1;
        parameters.weightx = 1;
        parameters.weighty = 1;
        parameters.anchor = GridBagConstraints.SOUTHEAST;
        parameters.fill = GridBagConstraints.VERTICAL;

        JButton back = new JButton("Back");
        //addTeam.addActionListener(e -> TeamController.addTeam(this));
        add(back, parameters);
    }
}
