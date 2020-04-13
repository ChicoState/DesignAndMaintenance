// Adapter Design Pattern example:
// Temperature_C sets and gets a temperature in degrees Celsius
// (the Target, new standard being adopted in place of legacy Temperature_F)
public class Temperature_C {

  private double _tempC;

  // Celsius Temperature Constructor
  public Temperature_C() {}

  // Celsius Temperature Constructor (temp given as degrees Celsius)
  public Temperature_C(double data) {
    _tempC = data;
  }

  // Return the temperature in degrees Celsius
  public double get_temp(){
    return _tempC;
  }
}
