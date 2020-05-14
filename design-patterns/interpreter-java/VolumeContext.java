// Volume Context is a list of expressions that we are trying to interpret.
// Each string in the list starts with an amount, followed by a space, followed
// by a unit of measurement.
import java.util.Vector;

public class VolumeContext {
  private Vector<String> _volumes;

  // constructor with list of volumes and different forms of measurement
  public VolumeContext() {
    _volumes = new Vector<String> ();
    _volumes.add("2 gallon");
    _volumes.add("0.5 gallon");
    _volumes.add("1 quart");
    _volumes.add("0.75 quart");
    _volumes.add("3 pint");
    _volumes.add("0.5 pint");
    _volumes.add("1.5 cup");
    _volumes.add("0.75 cup");
    _volumes.add("1 tablespoon");
    _volumes.add("0.5 tablespoon");
    _volumes.add("4 teaspoon");
    _volumes.add("1 teaspoon");
  }

  // get list of volumes as it currently exists in the interpretation process
  public Vector<String> getList() {
    return _volumes;
  }

  // Takes in a list of items (the amount and type of measurement) and
  // interprets what the amount is in cups
  public void convertToCups(Vector<String> itemList) {
    for(int i = 0; i < itemList.size(); i++){
      String separated[]= itemList.get(i).split(" ");
      if(separated[1].equals("gallon")){
        double tmp = Double.parseDouble(separated[0])*16; // gallon to cups
        _volumes.set(i, String.valueOf(tmp) + " cups");
      }
      else if(separated[1].equals("quart")){
        double tmp = Double.parseDouble(separated[0])*4; // quart to cups
        _volumes.set(i, String.valueOf(tmp) + " cups");
      }
      else if(separated[1].equals("pint")){
        double tmp = Double.parseDouble(separated[0])*2; // pint to cups
        _volumes.set(i, String.valueOf(tmp) + " cups");
      }
      else if(separated[1].equals("tablespoon")){
        double tmp = Double.parseDouble(separated[0])/16; // Tbsp to cups
        _volumes.set(i, String.valueOf(tmp) + " cups");
      }
      else if(separated[1].equals("teaspoon")){
        double tmp = Double.parseDouble(separated[0])/48; // tsp to cups
        _volumes.set(i, String.valueOf(tmp) + " cups");
      }
    }
  }

  // Takes in a list of items (the amount and measurement in cups) and
  // interprets what the amount is in fluid ounces
  public void convertToFlOz(Vector<String> itemList) {

    for(int i = 0; i < itemList.size(); i++){
      String separated[]= itemList.get(i).split(" ");
      double tmp = Double.parseDouble(separated[0])*8; // 1 cup = 8 fl oz
      String formatted = String.format("%.3f", tmp);
      _volumes.set(i, String.valueOf(formatted) + " fl oz");
    }
  }
}
