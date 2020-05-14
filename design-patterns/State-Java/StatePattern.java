import java.util.Scanner;

class StatePattern  
{ 
    public static void main(String[] args)  
    { 
        AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        int selection;
        System.out.println("Choose state from choices");
        /***************************************************/

        
        System.out.println("-------------------------\n");
        System.out.println("1 - Select Silent");
        System.out.println("2 - Select Vibration");
        System.out.println("3 - Select Switched off");
        System.out.println("4 - Select Flight");
        System.out.println("5 - Select Sleep");
        Scanner input = new Scanner(System.in);
        while((selection = input.nextInt())>0)

        if(selection==1)
        {
        	stateContext.setState(new Silent());
        	 stateContext.alert();
        }
        else if(selection ==2)
        {
        	stateContext.setState(new Vibration());
       	 stateContext.alert();
        }
        else if(selection==3)
        {
        	stateContext.setState(new SwitchedOff());
       	 stateContext.alert();
        }
        else if(selection==4)
        {
        	stateContext.setState(new Flight());
       	 stateContext.alert();
        }
        else if(selection==5)
        {
        	stateContext.setState(new Sleep());
       	 stateContext.alert();
        }
        else {
        	break;
        }
    } 
} 