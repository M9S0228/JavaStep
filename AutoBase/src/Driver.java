import java.util.ArrayList;
import java.util.List;

public class Driver {
    private final String name;
    private final int experience;
    private boolean available;
    private double earnings;
    private List<Cargo> cargoHistory;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.available = true;
        this.earnings = 0;
        this.cargoHistory = new ArrayList<>();

    }
    public void assignCargo(Cargo cargo) {
        this.available = false;
        cargoHistory.add(cargo);
    }

    public String getName() {
        return name;
    }


    public int getExperience() {
        return experience;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public void assignToTrip(){
        this.available = false;
    }
    public void completeTrip(double payment){
        this.available = true;
        this.earnings += payment;
    }
}
