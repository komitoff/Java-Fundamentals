package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

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
        for (Team team : this.teams) {
            output.append(team);
            output.append("\n");
        }

        return output.toString();
    }
}
