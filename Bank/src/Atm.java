import java.util.HashMap;
import java.util.Map;
import Exception.ATMException;
import Exception.WithdrawException;
import Exception.InsufficientFundsException;

public class Atm {
    private Map<Integer, Integer> banknotes;
    private int minWithdrawalAmount;
    private int maxBanknotesToDispense;
    private  static  int[] Denominations = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};

    public Atm( int minWithdrawalAmount, int maxBanknotesToDispense) {
        banknotes = new HashMap<>();
        this.minWithdrawalAmount = minWithdrawalAmount;
        this.maxBanknotesToDispense = maxBanknotesToDispense;
    }

    public void initializeATM(Map<Integer, Integer> banknotes){
        this.banknotes.clear();
        this.banknotes.putAll(banknotes);
    }

    public Map<Integer, Integer> withdrawMoney(int amount) throws ATMException {
        if (amount < minWithdrawalAmount || amount> maxBanknotesToDispense){
            throw new WithdrawException("Invalid withdrawal amount");
        }

        Map<Integer, Integer> withdrawalResult = new HashMap<>();

        int remainingAmount = amount;
        for (int denomination : Denominations){
            int banknotesCount = banknotes.getOrDefault(denomination,0);
            int banknotesToDispense = Math.min(remainingAmount/denomination, banknotesCount);

            if(banknotesToDispense > 0 ){
                withdrawalResult.put(denomination,banknotesToDispense);
                banknotes.put(denomination, banknotesCount - banknotesToDispense);
                remainingAmount -= banknotesToDispense * denomination;
            }
        }

        if(remainingAmount == 0){
            return withdrawalResult;
        }
        else{
            throw new InsufficientFundsException("Insufficient funds in the ATM");
        }
    }

    public int getTotalAmount(){
        int totalAmount = 0;
        for(int denomination : banknotes.keySet()){
            totalAmount+= denomination * banknotes.get(denomination);
        }
        return totalAmount;
    }

}
