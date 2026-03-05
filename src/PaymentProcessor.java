public class PaymentProcessor {

    TransactionValidator tvalidator = new TransactionValidator();

    void process(Transaction tx){

        String id = tx.getTransactionId();
        String cardNum = tx.getCardNumber();
        double amount = tx.getAmount();

        if (!tvalidator.isLengthRight(cardNum)){
            System.out.println("Transaction: " + id + " FAILED: Invalid card length");
            return;
        }

        if (!tvalidator.isNumeric(cardNum)){
            System.out.println("Transaction: " + id + " FAILED: Invalid card number");
            return;
        }

        if (!tvalidator.isAmountRight(amount)){
            System.out.println("Transaction: " + id + " FAILED: Invalid amount");
            return;
        }

        if (!tvalidator.isIdDifferent(id)){
            System.out.println("Transaction: " + id + " FAILED: Repeated transaction");
            return;
        }

        System.out.println("Transaction: " + id + " APPROVED");

    }

}
