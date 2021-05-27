public class SchoolFootballClub {
    //inherits FootballClub
    private String school; //name of the school which the team belongs to.

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public SchoolFootballClub(String school) {
        this.school = school;
    }
}
