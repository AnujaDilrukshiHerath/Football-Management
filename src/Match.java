import java.util.HashMap;
import java.util.Map;

public class Match {

    //Date of the match played.
    private Date matchDate;

    //Venue(Ground) is taken inorder to differentiate home and away teams; Also to store the venue of the match.
    private String venue;

    private Map <FootballClub, Integer>teamGoal;

    //Above hashmap holds the club played as a key, and the number of goals scored as its value.


    public Match(Date matchDate, String venue, HashMap<FootballClub, Integer> teamGoal) {
        this.matchDate = matchDate;
        this.venue = venue;
        this.teamGoal = teamGoal;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Map<FootballClub, Integer> getTeamGoal() {
        return teamGoal;
    }

    public void setTeamGoal(HashMap<FootballClub, Integer> teamGoal) {
        this.teamGoal = teamGoal;
    }
}
