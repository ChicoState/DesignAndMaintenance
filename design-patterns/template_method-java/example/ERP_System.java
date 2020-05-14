public class ERP_System {
    public static void main(String [] args)
    {
        //Running a purchase transaction
        Transaction transaction_purchase = new Purchase();
        transaction_purchase.initialize();
        transaction_purchase.get_credentials("purchase_head", "password");
        transaction_purchase.transaction_with("Ikea");
        transaction_purchase.process_transaction(560000);
        transaction_purchase.end_transaction();

        System.out.println("\n*-----------------------------*");

        Transaction transaction_sale = new Sale();
        transaction_sale.initialize();
        transaction_sale.get_credentials("sale_head", "password");
        transaction_sale.transaction_with("University");
        transaction_sale.process_transaction(30000);
        transaction_sale.end_transaction();

        System.out.println("\n*-----------------------------*");

        Transaction transaction_payroll = new Payroll();
        transaction_payroll.initialize();
        transaction_payroll.get_credentials("hr_head", "password");
        transaction_payroll.transaction_with("Adam");
        transaction_payroll.process_transaction(15000);
        transaction_payroll.end_transaction();

    }
}