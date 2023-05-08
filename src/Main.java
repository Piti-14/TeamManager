import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MainFrame myWindow = new MainFrame();
    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        this.setBounds(200, 200, 600, 600);
        MainPanel panel = new MainPanel();
        this.add(panel);

        PlayerPanel players = new PlayerPanel();
        this.add(players);

        this.setDefaultCloseOperation(3);
        this.setVisible(true);


    }

    public void changePanel() {

    }
}

class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());

        JPanel top = new JPanel(new FlowLayout());
        JPanel menuBar = new JPanel(new BorderLayout());
        MenuBar menu = new MenuBar();

        menuBar.add(menu, BorderLayout.NORTH);
        JButton player = new JButton("Enter new player");
        JButton team = new JButton("Enter new team");
        JButton results = new JButton("Show results");
        top.add(player);
        top.add(team);
        top.add(results);

        add(menuBar, BorderLayout.NORTH);
        add(top, BorderLayout.CENTER);

        //player.addActionListener(e ->);

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

class TeamPanel extends JPanel {

}

class MenuBar extends JPanel {
    public MenuBar() {
        JMenuBar myBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemNew = new JMenuItem("New");
        itemNew.setEnabled(false);
        menuFile.add(itemSave);
        menuFile.add(itemNew);

        JMenu menuEdit = new JMenu("Edit");
        JMenuItem editTeam = new JMenuItem("Team");
        JMenuItem editPlayer = new JMenuItem("Player");
        menuEdit.add(editTeam);
        menuEdit.add(editPlayer);

        JMenu menuView = new JMenu("View");
        JMenuItem itemDark = new JMenuItem("Dark");
        JMenuItem itemWhite = new JMenuItem("White");
        itemDark.addActionListener((e)->setBackground(Color.DARK_GRAY));
        itemWhite.addActionListener((e)->setBackground(Color.WHITE));
        menuView.add(itemDark);
        menuView.add(itemWhite);

        myBar.add(menuFile);
        myBar.add(menuEdit);
        myBar.add(menuView);

        add(myBar, BorderLayout.NORTH);
    }
}