// Facade Design Pattern: RideAnalyzerFacade
// This Facade provides a simple interface for Ride Analysis in a fitness app,
// hiding the complexity of the underlying subsystem
import java.text.DecimalFormat;
import java.lang.Math;

public class RideAnalyzerFacade {
  public void showAnalysis() {
    Elevation elev = new Elevation();
    int gain = elev.getElevationGain();
    System.out.println("Elevation gain: " + gain + " ft");

    Speed speed = new Speed();
    double avg = speed.getAvgSpeed();
    DecimalFormat df_avg = new DecimalFormat("#.##");
    System.out.println("Average Speed: " + df_avg.format(avg) + " mi/hr");

    HeartRate hr = new HeartRate();
    int max = hr.getMaxHeartRate();
    System.out.println("Maximum Heart Rate: " + max + " bpm");

    Power power = new Power();
    double pow = power.getAvgPower();
    System.out.println("Average Power: " + (int)Math.ceil(pow) + " W");
  }
}
