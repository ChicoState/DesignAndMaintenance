// driver: holds main class to run the RideAnalyzer program (Facade example)
import java.text.DecimalFormat;
import java.lang.Math;

public class driver {
  public static void main(String[] args) {
    try {
      driver.run(args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  // A Client simply calls the showAnalysis() function from RideAnalyzerFacade
  public static void run (String[] args) throws Exception {
    RideAnalyzerFacade ride = new RideAnalyzerFacade();
    ride.showAnalysis();
  }
}
