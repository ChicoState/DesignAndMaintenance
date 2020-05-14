public class Client{
    public static void main(String [] args)
    {
        User admin = new SuperUser(6);
        admin.execute("DELETE");

        User usr1 = new NormalUser(1);
        usr1.execute("DELETE");
    }
}