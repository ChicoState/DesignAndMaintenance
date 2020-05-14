abstract class Transaction {
    //Step 1
    //Begin the Transaction
    public abstract void initialize();
    
    //Step 2
    //Get login credential of the employee in charge of transaction
    public abstract void get_credentials(String uname, String pword);

    //Step 3
    //Takes the persons name, and returns if its a Vendor or Customer
    public abstract String transaction_with(String name);
    
    //Step 4
    //Process the transaction
    public abstract void process_transaction(double amnt);

    //Step 5
    //End transaction
    public abstract void end_transaction();

}