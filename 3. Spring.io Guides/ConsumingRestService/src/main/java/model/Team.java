package model;

public class Team {
    private Long id;
    private String name;
    private String shortName;
    private String squadMarketValue;
    private String crestUrl;

    public Team () { }

    public Long getId() {
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
