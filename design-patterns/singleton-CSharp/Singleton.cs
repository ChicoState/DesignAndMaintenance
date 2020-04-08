using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Math;
namespace StaticClasses
{
  class Calculas
  {
    static void Main(string[] args)
    {

      int input1=20;
      int input2=10;

      Console.WriteLine("Addition of two integers {0} and {1} is {2}",input1,input2, Arithmetic.Addition(input1, input2));
      Console.WriteLine("Substraction of two integers {0} and {1} is {2}", input1,input2,Arithmetic.Substraction(input1, input2));
      Console.WriteLine("Division of two integers {0} and {1} is {2}", input1,input2,Arithmetic.Division(input1, input2));
      Console.WriteLine("Multiplication of two integers {0} and {1} is {2}",input1,input2, Arithmetic.Multiplication(input1, input2));
      Console.Read();

    }
  }
  public static class Arithmetic
  {

    public static int Addition(int input1,int input2)
    {
      return input1 + input2;
    }
    public static int Substraction(int input1,int input2)
    {
      return input1 - input2;
    }
    public static int Division(int input1,int input2)
    {
      return input1 / input2;
    }
    public static int Multiplication(int input1,int input2)
    {
      return input1 * input2;
    }
  }
}
