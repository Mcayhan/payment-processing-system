import java.util.HashSet;
import java.util.Set;

public class TransactionValidator {

    private Set<String> idSet = new HashSet<>();


    boolean isLengthRight(String cardNumber){
        if (cardNumber.length() == 16){
            return true;
        }else {
            return false;
        }
    }

    boolean isNumeric(String cardNumber){
        return cardNumber.matches("[0-9]+"); //[0-9]: any digit, +: one or more times
    }

    boolean isAmountRight(double amount){
        if (amount > 0){
            return true;
        }else {
            return false;
        }

    }

    boolean isIdDifferent(String transactionId){
        if (idSet.contains(transactionId)){
            return false;
        }else {
            idSet.add(transactionId);
            return true;
        }
    }

    //Task 4 Small Agorithm Question

    boolean hasConsecutiveDigits(String cardNumber){

        for (int i = 0; i < cardNumber.length() - 1; i++) {
            if (cardNumber.charAt(i) == cardNumber.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

}
