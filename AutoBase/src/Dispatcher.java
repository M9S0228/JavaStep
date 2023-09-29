import java.util.List;

public class Dispatcher {
    private List<Driver> drivers;
    private List<Vehicle> vehicles;

    public Dispatcher(List<Driver> drivers, List<Vehicle> vehicles) {
        this.drivers = drivers;
        this.vehicles = vehicles;
    }
    private int calculateExperience(Cargo cargo){
        return 1;
    }
    private double calculatePayment(Cargo cargo) {
        return 100.0;
    }
    public Trip assignTrip(Cargo cargo){
        Driver selectDriver = null;
        Vehicle selectVehicle = null;

        for (Driver driver : drivers){
            if(driver.isAvailable() && driver.getExperience() >= calculateExperience(cargo)){
                selectDriver = driver;
                break;
            }
        }
        if (selectDriver == null) {
            System.out.println("Немає вільних водіїв!");
            return null;
        }
        for (Vehicle vehicle : vehicles){
            if(vehicle.isAvailable() && vehicle.getCapacity() >= cargo.getQuantity()){
                selectVehicle = vehicle;
                break;
            }
        }
        if (selectVehicle == null) {
            System.out.println("Немає вільних автомобілів!");
            return null;
        }
        Trip trip = new Trip(selectDriver, selectVehicle, cargo);
        trip.setPayment(calculatePayment(cargo));
        return trip;
    }

}
