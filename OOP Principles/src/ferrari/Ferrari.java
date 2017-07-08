package ferrari;

public class Ferrari implements Car{

    public static final String MODEL = "488-Spider";

    private String driverName;


    @Override
    public String getDriverName() {
        return this.driverName;
    }

    @Override
    public void brake() {

    }

    @Override
    public void gas() {

    }

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return this.MODEL + "/Brakes!/Zadu6avam sA!/" + this.getDriverName();
    }
}
