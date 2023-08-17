import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть 2 числа для діапазону:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int c = number2;
            number2 = number1;
            number1 = c;
        }

        for (int i = number1; i < number2; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
