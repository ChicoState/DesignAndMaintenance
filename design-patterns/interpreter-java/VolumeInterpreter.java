// VolumeInterpreter (Abstract expression)
// VolumeInterpreter is an interface that defines one abstract interpet method.
// interpret() takes the context (expression to be interpreted) as a parameter.
// The non-terminal and terminal expressions (Measurement and FluidOunces
// classes) affect the state of the Context by intepreting another aspect of
// the same Context or returning the interpreted result.
import java.util.Vector;

public interface VolumeInterpreter{
  public Vector<String> interpret(VolumeContext context);
}
