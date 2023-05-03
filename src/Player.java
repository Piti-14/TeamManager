public class Player {

    private String name, position, club;
    private int year, number;
    private double height;

    public Player(String position, String name, int year, double height, int number, String club) {
        this.position = position;
        this.name = name;
        this.year = year;
        this.height = height;
        this.number = number;
        this.club = club;
    }

    public String toString() {
        return "Player [Name: " + name + "; Year: " + year + "; Height: " + height + "; Number: " + number + "; Position: " + position + "; Club: " + club + "]";
    }
}
