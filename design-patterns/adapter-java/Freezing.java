// Adapter Design Pattern example:
// Freezing class was originally created to determine if the temperature is
// freezing, assuming the temperature is given in degrees Fahrenheit
// (compatible with Temperature_F class)
public class Freezing {

  // Freezing class constructor
  public Freezing() {}

  // determines if the given temperature is freezing
  public boolean isItFreezing(Temperature_F tempF) {
    if(tempF.get_temp() > 32.0){
      return false;
    }
    return true;
  }
}
