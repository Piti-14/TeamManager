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

        this.setDefaultCloseOperation(3);
        this.setVisible(true);

        PlayerPanel players = new PlayerPanel();
        this.add(players);


        /*TeamPanel teams = new TeamPanel();
        teams.setVisible(false);
        this.add(teams);*/
    }

    public void changePanel() {

    }
}

class MainPanel extends JPanel {

    /*public MainPanel(){
        this.setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();
        JMenu menuArchive = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemNew = new JMenuItem("New");
        itemNew.setEnabled(false);
        menuArchive.add(itemSave);
        menuArchive.add(itemNew);

        JMenu menuEdit = new JMenu("Edit");

        JMenu menuView = new JMenu("Vista");
        JMenuItem itemDark = new JMenuItem("Dark");
        JMenu menuBackground = new JMenu("Background Color");
        menuView.add(itemDark);
        menuView.addSeparator();
        menuView.add(menuBackground);
        JMenuItem itemRed = new JMenuItem("Red");
        JMenuItem itemBlue = new JMenuItem("Blue");
        JMenuItem itemWhite = new JMenuItem("White");
        itemRed.addActionListener((e)->setBackground(Color.RED));
        itemBlue.addActionListener((e)->setBackground(Color.BLUE));
        itemWhite.addActionListener((e)->setBackground(Color.WHITE));
        itemDark.addActionListener((e)->setBackground(Color.DARK_GRAY));
        menuBackground.add(itemBlue);
        menuBackground.add(itemRed);
        menuBackground.add(itemWhite);

        myBar.add(menuArchive);
        myBar.add(menuEdit);
        myBar.add(menuView);

        add(myBar, BorderLayout.NORTH);
        //pack();
    }*/
    public MainPanel() {
        setLayout(new BorderLayout());

        JPanel top = new JPanel(new FlowLayout());
        JButton player = new JButton("Enter new player");
        JButton team = new JButton("Enter new team");
        JButton results = new JButton("Show results");
        top.add(player);
        top.add(team);
        top.add(results);

        add(top, BorderLayout.NORTH);

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