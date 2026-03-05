void main() {

    PaymentProcessor processor = new PaymentProcessor();

    System.out.println();
    System.out.println("-----------Payment Transaction System-----------");
    System.out.println("________________________________________________");

    Transaction t1 = new Transaction("TX123", "1234567812345678", 15000.0, System.currentTimeMillis());
    Transaction t2 = new Transaction("TX123", "1234567812345678", 15000.0, System.currentTimeMillis());
    Transaction t3 = new Transaction("TX124", "1112345612345667", 50000.0, System.currentTimeMillis());
    Transaction t4 = new Transaction("TX125", "5892456890214532", 0.0, System.currentTimeMillis());
    Transaction t5 = new Transaction("TX126", "2826", 10000.50, System.currentTimeMillis());

    System.out.println(t1);
    processor.process(t1);

    System.out.println("________________________________________________");

    System.out.println(t2);
    processor.process(t2);

    System.out.println("________________________________________________");

    System.out.println(t3);
    processor.process(t3);

    System.out.println("________________________________________________");

    System.out.println(t4);
    processor.process(t4);

    System.out.println("________________________________________________");

    System.out.println(t5);
    processor.process(t5);

    System.out.println("________________________________________________");

    //task 4
    TransactionValidator tVal = new TransactionValidator();

        System.out.println("Consecutive Digits Control:\n");

    boolean control1 = tVal.hasConsecutiveDigits(t1.getCardNumber());
    boolean control2 = tVal.hasConsecutiveDigits(t3.getCardNumber());

    System.out.println("Transaction ID: " + t1.getTransactionId() + " -> " + control1);
    System.out.println("Transaction ID: " + t3.getTransactionId() + " -> " + control2);

}
