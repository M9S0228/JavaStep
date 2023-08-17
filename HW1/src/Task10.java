import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(arr));

        int evenCount = 0;
        int notEvenCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for(int num : arr){
            if(num % 2 ==0){
                evenCount++;
            }

            if(num % 2 !=0){
                notEvenCount++;
            }

            if(num >= 0){
                positiveCount++;
            }

            if(num < 0){
                negativeCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] notEvenArr = new int[notEvenCount];
        int[] positiveArr = new int[positiveCount];
        int[] negativeArr = new int[negativeCount];

        int evenIndex = 0;
        int notEvenIndex = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[evenIndex] = num;
                evenIndex++;
            } else {
                notEvenArr[notEvenIndex] = num;
                notEvenIndex++;
            }

            if (num >= 0) {
                positiveArr[positiveIndex] = num;
                positiveIndex++;
            } else {
                negativeArr[negativeIndex] = num;
                negativeIndex++;
            }
        }

        System.out.println("Масив з парними числами: " + Arrays.toString(evenArr));
        System.out.println("Масив з непарними числами: " + Arrays.toString(notEvenArr));
        System.out.println("Масив з додатніми числами: " + Arrays.toString(positiveArr));
        System.out.println("Масив з від'ємними числами: " + Arrays.toString(negativeArr));
    }
}
