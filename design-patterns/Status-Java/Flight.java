class Flight implements MobileAlertState 
{ 
    @Override
    public void alert(AlertStateContext ctx)  
    { 
        System.out.println("On Flight mode..."); 
    } 
  
} 