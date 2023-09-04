import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input something:");
        String inputString = scanner.nextLine();

        System.out.println(inputString);

        int intValue;
        int intValue1;

        intValue = scanner.nextInt();
        System.out.println(intValue);

        intValue1 = scanner.nextInt();
        System.out.println(intValue1);

        String inputStringSecond = scanner.nextLine();
        //inputStringSecond = scanner.nextLine();
        System.out.println(inputStringSecond);
    }

    public String getName() {
        return "";
    }

    public void setName() {

    }
}

