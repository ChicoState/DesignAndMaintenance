// Facade Design Pattern: Speed
// A subsystem class (simplified for this example)
import java.util.Vector;

public class Speed {

  private Vector<Double> _speed = new Vector<Double>();

  // Speed Constructor
  // list of speeds (measured in miles per hour), randomly generated
  public Speed() {
    _speed.add(14.6);
    _speed.add(10.9);
    _speed.add(19.1);
    _speed.add(14.8);
    _speed.add(17.6);
    _speed.add(11.7);
    _speed.add(12.5);
    _speed.add(15.9);
    _speed.add(19.0);
    _speed.add(10.4);
  }

  // Return the average Speed
  public double getAvgSpeed(){
    int sz = _speed.size();
    double total = 0.0;
    for(int i = 0; i < sz; i++){
      total += _speed.get(i);
    }
    return total/sz;
  }
}
