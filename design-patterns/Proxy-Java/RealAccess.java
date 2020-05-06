public class RealAccess implements SystemAccess {  
    private String employeeName;  
    private int designationLevel;
    public RealAccess(String empName,int designation) {  
        this.employeeName = empName;  
        this.designationLevel=designation;
    }  
    @Override  
    public void grantSystemAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName+ " With destignation level of "+ designationLevel);  }
}