import java.util.Scanner;

public class Human {
    String FIO;
    String birthday;
    String phone;
    String city;
    String country;
    String address;

    public Human(String FIO, String birthday, String phone, String city, String country, String address) {
        this.FIO = FIO;
        this.birthday = birthday;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ПІБ: ");
        FIO = scanner.nextLine();

        System.out.print("Введіть дату народження: ");
        birthday = scanner.nextLine();

        System.out.print("Введіть контактний телефон: ");
        phone = scanner.nextLine();

        System.out.print("Введіть місто: ");
        city = scanner.nextLine();

        System.out.print("Введіть країну: ");
        country = scanner.nextLine();

        System.out.print("Введіть домашню адресу: ");
        address = scanner.nextLine();
    }

    public void printInfo(){
        System.out.println("ПІБ: " + FIO);
        System.out.println("Дата народження: " + birthday);
        System.out.println("Контактний телефон: " + phone);
        System.out.println("Місто: " + city);
        System.out.println("Країна: " + country);
        System.out.println("Домашня адреса: " + address);
    }

    public String getFIO() {
        return FIO;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }
}
