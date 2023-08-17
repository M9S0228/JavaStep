import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір лінії: ");
        int lineSize = scanner.nextInt();
        System.out.println("Введіть символ для відображення лінії: ");
        String lineSymbol = scanner.nextLine();
        lineSymbol = scanner.nextLine();
        System.out.println("Виберіть відображення лінії:\n1 - Горизонтальна\n2 - Вертикальна");
        int lineDirection= scanner.nextInt();
        switch (lineDirection){
            case 1:
                for (int i = 0; i < lineSize; i++) {
                    System.out.printf(lineSymbol);
                }
                break;
            case 2:
                for (int i = 0; i < lineSize; i++) {
                    System.out.println(lineSymbol);
                }
                break;
            default:
                System.out.println("Error!!!");
        }



    }
}
