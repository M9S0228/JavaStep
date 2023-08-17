import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 2 числа для діапазону таблиці множення:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int c = number2;
            number2 = number1;
            number1 = c;
        }

        for (int i = number1; i <= number2; i++) {
            for (int j = 0; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result );
            }
            System.out.println();
        }
    }
}
