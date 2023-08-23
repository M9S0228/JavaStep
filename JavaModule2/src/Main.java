import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        System.out.println("Виберіть клас який бажаєте заповнити: " +
                "\n1 - Людина" +
                "\n2 - Місто" +
                "\n3 - Країна" +
                "\n4 - Дріб");

        key = scanner.nextInt();
        switch (key){
            case 1:
                Human human = new Human("","","","","","");
                human.inputInfo();
                System.out.println("Введені дані: ");
                human.printInfo();
                break;
            case 2:
                City city = new City("","","",0,0);
                city.inputInfo();
                System.out.println("Введені дані: ");
                city.printInfo();
                break;
            case 3:
                Country country = new Country("","",0,"","","");
                country.inputInfo();
                System.out.println("Введені дані: ");
                country.printInfo();
                break;
            case 4:
                Fraction fraction1 = new Fraction(1, 2);
                Fraction fraction2 = new Fraction(3, 4);

                fraction1.inputFraction();
                fraction2.inputFraction();

                System.out.println("Дріб 1: " + fraction1);
                System.out.println("Дріб 2: " + fraction2);
                System.out.println("Введіть операцію яка бажаєте виконати між дробами: " +
                        "\n + - * /");

                String operation = scanner.nextLine();
                operation = scanner.nextLine();
                switch (operation){
                    case "+":
                        Fraction sum = fraction1.add(fraction2);
                        System.out.println(fraction1 + " + " + fraction2 + " = " + sum);
                        break;
                    case "-":
                        Fraction subtraction = fraction1.subtraction(fraction2);
                        System.out.println(fraction1 + " - " + fraction2 + " = " + subtraction);
                        break;
                    case "*":
                        Fraction prod = fraction1.prod(fraction2);
                        System.out.println(fraction1 + " * " + fraction2 + " = " + prod);
                        break;
                    case "/":
                        Fraction division = fraction1.division(fraction2);
                        System.out.println(fraction1 + " / " + fraction2 + " = " + division);
                        break;
                }
                break;

        }
    }
}