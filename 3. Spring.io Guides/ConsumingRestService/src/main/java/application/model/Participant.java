package application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Participant {
    private int count;
    private Team[] teams;

    public Participant () { }

    public int getCount() {
        return count;
    }

    public Team[] getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        StringBuffer output = new StringBuffer();
        output.append("total teams participating : " + this.getCount());
        output.append("\n");
        for (Team team : this.teams) {
            output.append(team);
            output.append("\n");
        }

        return output.toString();
    }
}
