public class Vehicle {
    private String cargoType;
    private int capacity;
    private boolean available;

    public Vehicle(String cargoType, int capacity) {
        this.cargoType = cargoType;
        this.capacity = capacity;
        this.available = true;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void assignToTrip(){
        this.available = false;
    }
    public void completeTrip(){
        this.available = true;
    }

    private void vehicleBreak(){
        this.available = false;
    }


}
