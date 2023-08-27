import java.util.Scanner;

public class Car {
    String brand;
    String model;
    int year;
    double engine;

    public Car() {

    }
    public Car(String brand, String model, int year, double engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Бренд : ");
        brand = scanner.nextLine();

        System.out.println("Марка : ");
        model = scanner.nextLine();

        System.out.println("Рік випуску: ");
        year = scanner.nextInt();

        System.out.println("Об'єм двигуна: ");
        engine = scanner.nextDouble();
    }

    public void showInfo(){
        System.out.println(brand + " " + model + " " + year + " " + engine);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
