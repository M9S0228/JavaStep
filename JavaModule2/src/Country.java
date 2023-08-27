import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    String country;
    String continent;
    int countPeople;
    String phoneCode;
    String capital;
    private ArrayList<String> cityNames;

    public Country() {
    }

    public Country(String country, String continent, int countPeople, String capital, String cityName, String phoneCode) {
        this.country = country;
        this.phoneCode = phoneCode;
        this.continent = continent;
        this.countPeople = countPeople;
        this.capital = capital;
        this.cityNames = new ArrayList<>();
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву країни: ");
        country = scanner.nextLine();

        System.out.print("Введіть континент: ");
        continent = scanner.nextLine();

        System.out.print("Введіть кількість жителів: ");
        countPeople = scanner.nextInt();

        System.out.print("Введіть телефон країни: ");
        phoneCode = scanner.nextLine();

        System.out.print("Введіть столицю: ");
        capital = scanner.nextLine();

        System.out.print("Введіть кількість міст: ");
        int numCities = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCities; i++) {
            System.out.print("Введіть назву міста " + (i + 1) + ": ");
            String cityName = scanner.nextLine();
            cityNames.add(cityName);
        }
    }

    public void printInfo(){
        System.out.println("Країна: " + country);
        System.out.println("Континент: " + continent);
        System.out.println("Кількість жителів: " + countPeople);
        System.out.println("Телефон країни: " + phoneCode);
        System.out.println("Назва столиці: " + capital);
        System.out.println("Назви міст: ");
        for (String city : cityNames) {
            System.out.println(city);
        }
    }
    public String getCountry() {
        return country;
    }

    public String getContinent() {
        return continent;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public String getCapital() {
        return capital;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public ArrayList<String> getCityNames() {
        return cityNames;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCityNames(ArrayList<String> cityNames) {
        this.cityNames = cityNames;
    }
}
