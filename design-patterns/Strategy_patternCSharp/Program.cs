using System;

class MainApp
{
  static void Main()
  {
    Console.WriteLine("Menu Evaluation:");
    EvaluateAnswer substraction = new EvaluateAnswer(new Substraction());
    Console.WriteLine("Evaluating the Substraction of 2 numbers: " + substraction.Evaluate(5,3).ToString());

    EvaluateAnswer addition = new EvaluateAnswer(new Addition());
    Console.WriteLine("Evaluating the Addition of 2 numbers: " + addition.Evaluate(5,3).ToString());

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
