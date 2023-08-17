import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 3 числа: ");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        int combined = value1 * 100 + value2 * 10 + value3;

        System.out.println("Сформированное число: " + combined);
        //Second
        System.out.println("Сформированное число: " + value1 + value2 + value3);

    }
}
