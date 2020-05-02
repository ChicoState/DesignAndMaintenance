public class Sale extends Transaction{

    String uname;
    String pword;
    String customer;
    double amount=0;

    @Override
    public void initialize() {
        System.out.println("\nInitializing a Sale Transaction.\n");
    }

    @Override
    public void get_credentials(String uname, String pword) {
        this.uname = uname;
        this.pword = pword;
        System.out.println("Welcome "+uname + "!");
        System.out.println("\nSales Order Create\n");
    }

    @Override
    public String transaction_with(String name) {
        customer = name;
        System.out.println("Customer: "+customer);
        return null;
    }

    private void credit_amount(double amnt)
    {
        amount = amnt;
    }

    @Override
    public void process_transaction(double amnt) {
        credit_amount(amnt);
    }

    @Override
    public void end_transaction() {
        System.out.println("Transaction Completed!");
        System.out.println("Amount "+amount +" CREDITED successfully.");
    }
    
}