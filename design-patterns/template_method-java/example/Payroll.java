public class Payroll extends Transaction{
    String uname;
    String pword;
    String employee;
    double amount=0;

    @Override
    public void initialize() {
        System.out.println("\nInitializing a Payroll Transaction.\n");
    }

    @Override
    public void get_credentials(String uname, String pword) {
        this.uname = uname;
        this.pword = pword;
        System.out.println("Welcome "+uname + "!");
        System.out.println("\nPayroll Create\n");
    }

    @Override
    public String transaction_with(String name) {
        employee = name;
        System.out.println("Employee: "+employee);
        return null;
    }

    private void transfer_amount(double amnt)
    {
        amount = amnt;
    }

    @Override
    public void process_transaction(double amnt) {
        transfer_amount(amnt);
    }

    @Override
    public void end_transaction() {
        System.out.println("Transaction Completed!");
        System.out.println("Amount "+amount +" TRANSFERRED successfully.");
    }
}