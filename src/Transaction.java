
public class Transaction {

    private String transactionId;
    private String cardNumber;
    private double amount;
    private long timestamp;

    public Transaction(String transactionId, String cardNumber, double amount, long timestamp) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {

        String maskedCard;

        if (cardNumber.length() == 16){
            String firstFour = cardNumber.substring(0,4);
            String lastFour = cardNumber.substring(cardNumber.length()-4);
            maskedCard = firstFour + "********" + lastFour;
        }else {
            maskedCard = cardNumber.replaceAll(".", "*"); // "." all characters
        }

        String prnt = "Transaction ID: " + transactionId +
                      "\nCard Number: " + maskedCard +
                      "\nAmount: " + amount +
                      "\nTimestamp: " + timestamp;

        return  prnt;

    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
