import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(arr));

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min = " + min + "\t\tMax = " + max);

        int negativ = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                 ++negativ;
            }
            if(arr[i] > 0){
                ++positive;
            }
            if(arr[i] == 0){
                ++zero;
            }
        }
        System.out.println("Кількість додатніх елементів: " + positive);
        System.out.println("Кількість від'ємних елементів: " + negativ);
        System.out.println("Кількість нульових елементів: " + zero);
    }
}
