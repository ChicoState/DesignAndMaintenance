using System;

class MainApp
{
  static void Main()
  {
    EvaluateAnswer substraction = new EvaluateAnswer(new Substraction());
    Console.WriteLine("Substraction of numbers: " + substraction.Evaluate(5,3).ToString());

    EvaluateAnswer addition = new EvaluateAnswer(new Addition());
    Console.WriteLine("Addition of numbers: " + addition.Evaluate(5,3).ToString());

    Console.Read();
  }
}
public interface EvaluateInterface
{
  int Evaluate(int a,int b);
}

class Substraction : EvaluateInterface
{
    public int Evaluate(int a,int b)
    {
      return a-b;
    }
}
class Addition : EvaluateInterface
{
    public int Evaluate(int a,int b)
    {
      return a+b;
    }
}
class EvaluateAnswer
{
    private EvaluateInterface evaluateInterface;
    public EvaluateAnswer(EvaluateInterface strategy)
    {
      evaluateInterface = strategy;
    }
    public int Evaluate(int a,int b)
    {
      return evaluateInterface.Evaluate(a,b);
    }
}
