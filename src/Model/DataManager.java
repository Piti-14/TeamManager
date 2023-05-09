package Model;

import java.util.ArrayList;

public class DataManager {

    private ArrayList<Player> players;
    private ArrayList<Team> teams;

    public DataManager() {
        players = new ArrayList<>();
        teams = new ArrayList<>();
    }

    public ArrayList<Player> displayPlayers() {
        return players;
    }

    public ArrayList<Team> displayTeams() {
        return teams;
    }

    public void savePlayer(Player player) {
        players.add(player);
    }

    public void saveTeam(Team team) {
        teams.add(team);
    }

    public void remove(ArrayList<?> array, int n) {
        array.remove(n);
    }
}
