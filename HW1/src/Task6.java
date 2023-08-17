import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість метрів: ");
        double meters = scanner.nextDouble();
        System.out.println("\tУ що бажаєте перевести метри?" +
                "\n1 - Милі" +
                "\n2 - Дюйми" +
                "\n3 - Ярди");
        int key = scanner.nextInt();
        switch (key){
            case 1:
                System.out.println(meters * 0.00062137);
                break;
            case 2:
                System.out.println(meters * 39.37);
                break;
            case 3:
                System.out.println(meters * 1.0936);
                break;
            default:
                break;
        }



    }
}
