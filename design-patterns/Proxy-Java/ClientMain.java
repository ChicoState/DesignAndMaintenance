public class ClientMain {  
    public static void main(String[] args)   
    {  
        InternetAccess access = new ProxyAccess("Ganpat gavde",3);
        InternetAccess access1 = new ProxyAccess("John",10);
        access.grantInternetAccess();  
        access1.grantInternetAccess();
    }  
}  
