using System;

namespace StateBehaviour
{
  class Program
  {
    static void Main(string[] args)
    {
      Player player =new Player();
      player.Goals(5);
      player.Goals(20);
      player.Goals(4);
      Console.Read();
    }
  }
  public class Player
  {
    StateBehaviour currentState;
    public Player()
    {
        this.currentState = new FirstClass();
    }
    public void Goals(int goals)
    {
      Console.WriteLine("Goals scored by the player: " + goals);
      if(goals <5)
        this.currentState = new FirstClass();
      if(goals >=5 && goals <10)
        this.currentState = new SecondClass();
      if(goals >=10)
        this.currentState = new ThirdClass();

        currentState.ExecuteCommand(this);
      }
    }
    public interface StateBehaviour
    {
        void ExecuteCommand(Player player);
    }
    public class FirstClass : StateBehaviour
    {
        public void ExecuteCommand(Player player)
        {
            Console.WriteLine("The player is in ThirdClass state.");
        }
    }
    // 'ConcreteStateB' class
    public class SecondClass : StateBehaviour
    {
        public void ExecuteCommand(Player player)
        {
            Console.WriteLine("The player is in SecondClass state.");
        }
    }
    // 'ConcreteStateC' class
    public class ThirdClass : StateBehaviour
    {
        public void ExecuteCommand(Player player)
        {
            Console.WriteLine("The player is in FirstClass state.");
        }
    }
}
