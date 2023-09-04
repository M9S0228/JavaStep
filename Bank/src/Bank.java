import java.util.Map;

public class Bank {
    private Atm[] atms;

    public Bank(int numberOfATMs) {
        atms = new Atm[numberOfATMs];
        for (int i = 0; i < numberOfATMs; i++) {
            atms[i] = new Atm(1, 5000);
        }
    }

    // Метод для ініціалізації мережі банкоматів
    public void initializeATMs(Map<Integer, Integer>[] atmInitialBalances) {
        for (int i = 0; i < atmInitialBalances.length; i++) {
            atms[i].initializeATM(atmInitialBalances[i]);
        }
    }

    // Метод для отримання загальної суми грошей в мережі банкоматів
    public int getTotalAmountInATMs() {
        int totalAmount = 0;
        for(Atm atm : atms){
            totalAmount += atm.getTotalAmount();
        }
        return totalAmount;
    }
    public Atm getAtm(int index){
        if(index >= 0 && index < atms.length){
            return atms[index];
        }
        else{
            throw new IllegalArgumentException("Invalid ATM index");
        }
    }
}