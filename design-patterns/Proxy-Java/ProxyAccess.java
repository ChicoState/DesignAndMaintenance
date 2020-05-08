public class ProxyAccess implements InternetAccess {  
           private String employeeName;  
           private int des;
           private RealInternetAccess  realaccess;  
           
               public ProxyAccess(String employeeName,int des) {  
            this.employeeName = employeeName;  
            this.des=des;
        }  
        @Override  
        public void grantInternetAccess()   
        {  
            if (getRole(employeeName) > 4)   
            {  
                realaccess = new RealInternetAccess(employeeName,des);  
                realaccess.grantInternetAccess();  
            }   
            else   
            {  
                System.out.println("No Internet access granted. Your job level is below 5");  
            }  
        }  
        public int getRole(String emplName) {  
            
            return des;  
        }  
}  