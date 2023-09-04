import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Exception.ATMException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(2);

        // Ініціалізуємо банкомати з початковими балансами
        Map<Integer, Integer>[] atmInitialBalances = new HashMap[2];
        atmInitialBalances[0] = new HashMap<>();
        atmInitialBalances[0].put(500, 3);
        atmInitialBalances[0].put(200, 7);
        atmInitialBalances[0].put(100, 10);
        atmInitialBalances[0].put(50, 12);
        atmInitialBalances[0].put(20, 4);
        atmInitialBalances[0].put(10, 1);
        atmInitialBalances[0].put(5, 2);
        atmInitialBalances[0].put(2, 11);
        atmInitialBalances[0].put(1, 9);

        atmInitialBalances[1] = new HashMap<>();
        atmInitialBalances[1].put(500, 5);
        atmInitialBalances[1].put(200, 15);
        atmInitialBalances[1].put(100, 4);

        bank.initializeATMs(atmInitialBalances);

        // Перевіряємо загальну суму грошей в мережі банкоматів
        int totalAmountInATMs = bank.getTotalAmountInATMs();
        System.out.println("Total amount in ATMs: " + totalAmountInATMs + " UAH");

        // Виводимо суму грошей у кожному банкоматі
        for (int i = 0; i < atmInitialBalances.length; i++) {
            int totalAmountInATM = bank.getAtm(i).getTotalAmount();
            System.out.print("ATM " + (i + 1) + ": " + totalAmountInATM + " UAH\t\t");
        }

        // Приклад видачі грошей з банкомату
        try {
            System.out.println("\n<----------------------------------------->");
            System.out.println("Which ATM do you want to withdraw funds: ");
            int atm = scanner.nextInt();
            System.out.println("Enter the amount you want to withdraw from 1 to 5000");
            int amount = scanner.nextInt();
            Map<Integer, Integer> withdrawalResult = bank.getAtm(atm-1).withdrawMoney(amount);
            System.out.println("Withdrawal result: " + withdrawalResult);
        } catch (ATMException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}