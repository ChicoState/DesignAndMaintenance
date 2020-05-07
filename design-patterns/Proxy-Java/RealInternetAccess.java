public class RealInternetAccess implements InternetAccess {  
    private String employeeName;  
    private int designationLevel;
    public RealInternetAccess(String empName,int designation) {  
        this.employeeName = empName;  
        this.designationLevel=designation;
    }  
    @Override  
    public void grantInternetAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName+ " With destignation level of "+ designationLevel);  
    }  
}