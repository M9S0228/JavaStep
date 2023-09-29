public class Trip {
    private final Cargo cargo;
    private final Driver driver;
    private final Vehicle vehicle;
    private double payment;

    public Trip(Driver driver, Vehicle vehicle, Cargo cargo) {
        this.cargo = cargo;
        this.driver = driver;
        this.vehicle = vehicle;
        this.driver.assignCargo(cargo);
        this.vehicle.assignToTrip();
    }
    public void complete(){
        this.vehicle.completeTrip();
        this.driver.completeTrip(payment);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
