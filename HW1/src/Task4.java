import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шестизначне число: ");
        int value = scanner.nextInt();
        if( value >= 100000 && value <= 999999){
            int digit1 = value / 100000;
            int digit2 = (value / 10000) % 10;
            int digit3 = (value / 1000) % 10;
            int digit4 = (value / 100) % 10;
            int digit5 = (value / 10) % 10;
            int digit6 = value % 10;

            int swapValue = digit6 * 100000 + digit5 * 10000 + digit3 * 1000 + digit4 * 100 + digit2 * 10 + digit1;

            System.out.println("Почакове число: " + value);
            System.out.println("Число після перестановки: " + swapValue);
        }
        else{
            System.out.println("Помилка! Введіть шестизначне число.");
        }
    }
}
