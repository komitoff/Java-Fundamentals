package application.model;

public class Team {
    private long id;
    private String name;
    private String shortName;
    private String squadMarketValue;
    private String crestUrl;

    public Team () { }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getSquadMarketValue() {
        return squadMarketValue;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    @Override
    public String toString() {
        return this.getId() + "\n" +
                this.getName() + "\n" +
                this.getShortName() + "\n" +
                this.getCrestUrl() + "\n" +
                this.getSquadMarketValue() + "\n";
    }
}
