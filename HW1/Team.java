package HW1;

public class Team {
    private String teamName;
    private Members[] team;


    public Team(Members[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Members[] getTeam() {
        return team;
    }
}
