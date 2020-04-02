// Adapter Design Pattern:
// Temperature_F class sets and gets a temperature in degrees Fahrenheit
// (Legacy code, the adaptee)
public class Temperature_F {

  private double _tempF;

  // Fahrenheit Temperature Constructor
  public Temperature_F() {}

  // Fahrenheit Temperature Constructor (temp given as degrees Fahrenheit)
  public Temperature_F(double data) {
    _tempF = data;
  }

  // Return the temperature in degrees Fahrenheit
  public double get_temp(){
    return _tempF;
  }
}
