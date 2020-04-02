// driver: holds main class to run the Temperature program
import java.util.Scanner;

public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void run (String[] args) throws Exception {
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);

    // Determine if it is freezing (Fahrenheit temperature, legacy code)
    System.out.println("Is it freezing?\nEnter the temperature in Fahrenheit:");
    double d = in.nextDouble();
    Temperature_F tempF = new Temperature_F(d);
    Freezing freezing = new Freezing();
    if(freezing.isItFreezing(tempF)){
      System.out.println("Yes, it is freezing\n");
    }
    else{
      System.out.println("No, it is not freezing\n");
    }

    // Determine if it is freezing (Celsius temperature, compatible with
    // Freezing class only because of the use of an Adapter)
    System.out.println("Is it freezing?\nEnter the temperature in Celsius:");
    d = in.nextDouble();
    Temperature_C tempC = new Temperature_C(d);
    TempC_Adapter adapted_tempC = new TempC_Adapter(tempC);
    if(freezing.isItFreezing(adapted_tempC)){
      System.out.println("Yes, it is freezing\n");
    }
    else{
      System.out.println("No, it is not freezing\n");
    }
  }
}
