using System;
using System.Collections.Generic;

namespace Command_Design_Pattern
{
  /// Main Program class for the command design pattern
  class Program

  {
    static void Main()
    {
      // Compute expression with the "PEMDAS" mathematical operations sequence
      // Create a new use for it

      OperationRule PEMDAS = new OperationRule();

      // Calculate

      PEMDAS.Compute('+', 500);
      PEMDAS.Compute('+', 50);
      PEMDAS.Compute('-', 40);
      PEMDAS.Compute('-', 10);

      // Check the answers by reversing the sequence to proove "PEMDAS" rule

      PEMDAS.ReverseOp(4);

      // Inverse 3 commands

      PEMDAS.Inverse(4);

      // Wait for PEMDAS

      Console.ReadKey();
    }
  }

  // The 'Command' abstract class

  abstract class Command

  {
    public abstract void Execute();
    public abstract void UnExecute();
  }

  // The 'ConcreteCommand' class

  class PEMDASCalculator : Command

  {
    private char _operator;
    private int _operand;
    private Calculator _calculator;

    // Constructor

    public PEMDASCalculator(Calculator calculator,
      char @operator, int operand)
    {
      this._calculator = calculator;
      this._operator = @operator;
      this._operand = operand;
    }

    //  operator

    public char Operator
    {
      set { _operator = value; }
    }

    //  operand

    public int Operand
    {
      set { _operand = value; }
    }

    //  new command

    public override void Execute()
    {
      _calculator.Operation(_operator, _operand);
    }

    // Unexecute last command

    public override void UnExecute()
    {
      _calculator.Operation(ReverseOp(_operator), _operand);
    }

    // Returns opposite operator for given operator

    private char ReverseOp(char @operator)
    {
      switch (@operator)
      {
        case '+': return '-';
        case '-': return '+';
        default: throw new

         ArgumentException("@operator");
      }
    }
  }

  // The 'Receiver' class

  class Calculator

  {
    private int _curr = 0;

    public void Operation(char @operator, int operand)
    {
      switch (@operator)
      {

        case '+': _curr += operand; break;
        case '-': _curr -= operand; break;
      }

      Console.WriteLine(
        "Current value = {0,3} (following {1} {2})",
        _curr, @operator, operand);
    }
  }

// The 'Invoker' class

  class OperationRule

  {
    // Initializers

    private Calculator _calculator = new Calculator();
    private List<Command> _commands = new List<Command>();
    private int _current = 0;

    public void Inverse(int levels)
    {
      Console.WriteLine("\n Inverse {0} levels ", levels);
      // Perform redo operations

      for (int i = 0; i < levels; i++)
      {
        if (_current < _commands.Count - 1)
        {
          Command command = _commands[_current++];
          command.Execute();
        }
      }
    }

    public void ReverseOp(int levels)
    {
      Console.WriteLine("\n ReverseOp {0} levels ", levels);
      // Perform ReverseOp operations

      for (int i = 0; i < levels; i++)
      {
        if (_current > 0)
        {
          Command command = _commands[--_current] as Command;
          command.UnExecute();
        }
      }
    }

    public void Compute(char @operator, int operand)
    {
      // Create command operation and execute it

      Command command = new PEMDASCalculator(
        _calculator, @operator, operand);
      command.Execute();

      // Add command to ReverseOp list

      _commands.Add(command);
      _current++;
    }
  }
}
