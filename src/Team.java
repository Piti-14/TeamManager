public class Team {

    private String country, competition, trainer;

    public Team(String country, String competition, String trainer) {

        this.country = country;
        this.competition = competition;
        this.trainer = trainer;
    }

    public String toString() {
        return "Team [Country: " + country + "; Competition: " + competition + "; Trainer: " + trainer + "]";
    }
}
