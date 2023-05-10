package View;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JPanel {
    public MenuBar() {
        setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();

        //First menu button
        JMenu menuFile = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemNew = new JMenuItem("New");
        itemNew.setEnabled(false);
        menuFile.add(itemSave);
        menuFile.add(itemNew);

        //Second menu button
        JMenu menuEdit = new JMenu("Edit");
        JMenuItem editTeam = new JMenuItem("Team");
        JMenuItem editPlayer = new JMenuItem("Player");
        menuEdit.add(editTeam);
        menuEdit.add(editPlayer);

        //Third menu button
        JMenu menuView = new JMenu("View");
        JMenuItem itemDark = new JMenuItem("Dark");
        JMenuItem itemWhite = new JMenuItem("White");
        itemDark.addActionListener((e)->setBackground(Color.DARK_GRAY));
        itemWhite.addActionListener((e)->setBackground(Color.WHITE));
        menuView.add(itemDark);
        menuView.add(itemWhite);

        //Finished menu bar
        myBar.add(menuFile);
        myBar.add(menuEdit);
        myBar.add(menuView);
        setVisible(true);
        add(myBar, BorderLayout.NORTH);
    }
}
