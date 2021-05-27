public class FootballClub {
    //can create objects out of this classes. (Premier league teams, Arsenal).
    //inherits SportsClub
    private String ground; // Home ground of the team.
    private int noOfWins;  // Number of Matches won
    private int noOfLoses; // Number of Matches lost
    private int noOfDraws; // Number of Matches drawn
    private int goalsFor;  // Total Number of goals scored throughout the season
    private int goalsAgainst; //Total Number of goals conceded by a team
    //Number of points can be calculated, with noOfWins, noOfLoses and noOfDraws
    //Likewise number of matches can be calculated by adding those three variables.

    //At the time of creating no need put values about the season progress
    public FootballClub(String ground) {
        this.ground = ground;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfLoses() {
        return noOfLoses;
    }

    public void setNoOfLoses(int noOfLoses) {
        this.noOfLoses = noOfLoses;
    }

    public int getNoOfDraws() {
        return noOfDraws;
    }

    public void setNoOfDraws(int noOfDraws) {
        this.noOfDraws = noOfDraws;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

}
