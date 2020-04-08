// Facade Design Pattern: Elevation
// A subsystem class (simplified for this example)
import java.util.Vector;

public class Elevation {

  private Vector<Integer> _elevations = new Vector<Integer>();

  // Elevation Constructor
  // list of elevations (measured in feet), randomly generated
  public Elevation() {
    _elevations.add(4);
    _elevations.add(10);
    _elevations.add(9);
    _elevations.add(4);
    _elevations.add(7);
    _elevations.add(1);
    _elevations.add(2);
    _elevations.add(5);
    _elevations.add(9);
    _elevations.add(10);
  }

  // Return the total Elevation Gain
  public int getElevationGain(){
    int sz = _elevations.size();
    int gain = 0;
    for(int i = 1; i < sz; i++){
      if(_elevations.get(i) > _elevations.get(i-1)){
        gain += _elevations.get(i) - _elevations.get(i-1);
      }
    }
    return gain;
  }
}
