// Facade Design Pattern: Power
// A subsystem class (simplified for this example)
import java.util.Vector;

public class Power {

  private Vector<Integer> _power = new Vector<Integer>();

  // Power Constructor
  // list of power values (measured in watts), randomly generated
  public Power() {
    _power.add(96);
    _power.add(109);
    _power.add(151);
    _power.add(148);
    _power.add(176);
    _power.add(177);
    _power.add(165);
    _power.add(159);
    _power.add(150);
    _power.add(144);
  }

  // Return the average Power
  public double getAvgPower(){
    int sz = _power.size();
    double total = 0;
    for(int i = 0; i < sz; i++){
      total += _power.get(i);
    }
    return total/sz;
  }
}
