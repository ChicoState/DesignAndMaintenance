using System;

namespace Facade
{
  public class Pizza
  {
    public void Veggie_Pizza()
    {
      Console.WriteLine("Vegeterian food : Veggie Pizza");
    }
    public void Chicken_Pizza()
    {
      Console.WriteLine("NonVegeterian food : Chicken Pizza");
    }
  }
  public class Burger
  {
    public void Veg_Burger()
    {
      Console.WriteLine("Vegeterian food : Veg Burger");
    }
    public void Beaf_Burger()
    {
      Console.WriteLine("NonVegeterian food : Beaf Burger");
    }
  }
  public class Sandwitch
  {
    public void Chesse_Sandwitch()
    {
      Console.WriteLine("Vegeterian food : Chesse Sandwitch");
    }
    public void Chicken_Sandwitch()
    {
      Console.WriteLine("NonVegeterian food : Chicken Sandwitch");
    }
  }

public class Food
{
  Pizza pizza;
  Burger burger;
  Sandwitch sandwitch;

  public Food()
  {
    pizza = new Pizza();
    burger = new Burger();
    sandwitch = new Sandwitch();
  }
  public void Vegeterian()
  {
    pizza.Veggie_Pizza();
    burger.Veg_Burger();
    sandwitch.Chesse_Sandwitch();
  }
  public void NonVegeterian()
  {
    pizza.Chicken_Pizza();
    burger.Beaf_Burger();
    sandwitch.Chicken_Sandwitch();
  }

}
class program{
  static void Main(string[] args)
  {
    Food food = new Food();
    Console.WriteLine("Vegeterian Food");
    food.Vegeterian();
    Console.WriteLine("NonVegeterian Food");
    food.NonVegeterian();
    Console.ReadLine();
  }
}
}
