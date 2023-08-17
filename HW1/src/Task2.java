import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число: ");
        int value = scanner.nextInt();

        System.out.println("Введіть процент: ");
        int percent = scanner.nextInt();

        int decision = ( value * percent ) / 100;
        System.out.println(percent + "% від " + value + " = " +  decision);
    }
}
