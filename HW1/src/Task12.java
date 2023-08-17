import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("\nВиберіть метод сортування:" +
                "\n1 - За зростанням" +
                "\n2 - За спаданням");

        int key = scanner.nextInt();

        switch (key){
            case 1:
                bubbleSortAscending(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                bubbleSortDescending(arr);
                System.out.println(Arrays.toString(arr));
                break;
        }
    }

    public static void bubbleSortAscending(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void bubbleSortDescending(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}
