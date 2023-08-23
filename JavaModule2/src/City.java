import java.util.Scanner;

public class City {
    String cityName;
    String region;
    String countryName;
    int phoneCode;
    int cityIndex;

    public City(String cityName, String region, String countryName, int phoneCode, int cityIndex) {
        this.cityName = cityName;
        this.region = region;
        this.countryName = countryName;
        this.phoneCode = phoneCode;
        this.cityIndex = cityIndex;
    }
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву міста: ");
        cityName = scanner.nextLine();

        System.out.print("Введіть регіон: ");
        region = scanner.nextLine();

        System.out.print("Введіть країну: ");
        countryName = scanner.nextLine();

        System.out.print("Введіть телефон міста: ");
        phoneCode = scanner.nextInt();

        System.out.print("Введіть індекс міста: ");
        cityIndex = scanner.nextInt();


    }

    public void printInfo(){
        System.out.println("Місто: " + cityName);
        System.out.println("Регіон: " + region);
        System.out.println("Країна: " + countryName);
        System.out.println("Телефон: " + phoneCode);
        System.out.println("Індекс: " + cityIndex);
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegion() {
        return region;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public int getCityIndex() {
        return cityIndex;
    }
}
