// Adapter Design Pattern example:
// TempC_Adapter lets us determine if Temperature_C is freezing (using the
// Freezing class that was originally created for Temperature_F) by converting
// the Celsius temp to a format that is compatible with the Freezing class
public class TempC_Adapter extends Temperature_F {

  private Temperature_C _tempC;

  public TempC_Adapter(Temperature_C tempC){
    _tempC = tempC;
  }

  //convert Celcius temperature to Fahrenheit
  @Override
  public double get_temp(){
    return (_tempC.get_temp() * 9.0/5.0) + 32.0;
  }
}
