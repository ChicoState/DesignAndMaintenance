

public class Purchase extends Transaction{
    String uname;
    String pword;
    String vendor;
    double amount=0;

    @Override
    public void initialize() {
        System.out.println("\nInitializing a Purchase Transaction.\n");
    }

    @Override
    public void get_credentials(String uname, String pword) {
        this.uname = uname;
        this.pword = pword;
        System.out.println("Welcome "+uname + "!");
        System.out.println("\nPurchase Order Create\n");
    }

    @Override
    public String transaction_with(String name) {
        vendor = name;
        System.out.println("Vendor: "+vendor);
        return null;
    }

    private void debit_amount(double amnt)
    {
        amount = amnt;
    }

    @Override
    public void process_transaction(double amnt) {
        debit_amount(amnt);
    }

    @Override
    public void end_transaction() {
        System.out.println("Transaction Completed!");
        System.out.println("Amount "+amount +" DEBITED successfully.");
    }
    
}