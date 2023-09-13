import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class MainCar {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String name = "Car" + i;
            String color = getRandomColor();
            int maxSpeed = random.nextInt(300);
            Car car = new Car(name, color, maxSpeed);
            carList.add(car);
        }

        for (Car car: carList) {
            System.out.println(car.getBrand() + " | " + car.getColor() + " | " + car.getMaxSpeed());
        }

        Optional<Car> fastestRedCar = carList.stream()
                .filter(car-> car.getColor().equalsIgnoreCase("Red")).max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()));

        System.out.println("##########################################");
        System.out.println(fastestRedCar.get().getBrand() + " | " + fastestRedCar.get().getColor() + " | " + fastestRedCar.get().getMaxSpeed() + "km/h");


    }
    private static String getRandomColor(){
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black", "White", "Silver"};
        Random random = new Random();
        int i = random.nextInt(colors.length);
        return colors[i];
    }
}