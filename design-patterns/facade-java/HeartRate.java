// Facade Design Pattern: HeartRate
// A subsystem class (simplified for this example)
import java.util.Vector;

public class HeartRate {

  private Vector<Integer> _heartrate = new Vector<Integer>();

  // HeartRate Constructor
  // list of heart rates (in beats per minute), randomly generated
  public HeartRate() {
    _heartrate.add(126);
    _heartrate.add(149);
    _heartrate.add(171);
    _heartrate.add(158);
    _heartrate.add(176);
    _heartrate.add(137);
    _heartrate.add(165);
    _heartrate.add(159);
    _heartrate.add(180);
    _heartrate.add(144);
  }

  // Return the Maximum Heart Rate
  public int getMaxHeartRate(){
    int sz = _heartrate.size();
    int max = 0;
    for(int i = 0; i < sz; i++){
      if(_heartrate.get(i) > max){
        max = _heartrate.get(i);
      }
    }
    return max;
  }
}
