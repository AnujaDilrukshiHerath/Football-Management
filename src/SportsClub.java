import java.io.Serializable;

public abstract class SportsClub implements Serializable {
        private String clubName; // Name of the sports club.
        private String location; // City where the club is situated
        private String coach;    // HeadCoach who is in charge of the team

        public SportsClub(String clubName, String location, String coach){
                this.clubName = clubName;
                this.location = location;
                this.coach = coach;
        }

        public String getClubName() {
                return clubName;
        }

        public void setClubName(String clubName) {
                this.clubName = clubName;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        public String getCoach() {
                return coach;
        }

        public void setCoach(String coach) {
                this.coach = coach;
        }

        public String toString() {
                return "Name of the club: " +clubName;
        }
}
