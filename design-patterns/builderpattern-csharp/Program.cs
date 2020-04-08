using System;
using System.Collections.Generic;

namespace BuilderPattern
{

// Builder Innterface
public interface IBeverageBuilder
{
 void SetDrinks();
 void SetType();
 void SetQuantity();
 void SetHotorCold();
 void SetIngredients();

 Beverage GetBeverage();
}

// Concrete Builder Class 1

public class CoffeeBuilder : IBeverageBuilder
{
 Beverage objBeverage = new Beverage();
 public void SetDrinks()
 {
 objBeverage.Drinks = "Coffee";
 }

 public void SetType()
 {
 objBeverage.Type = "Black Coffee";
 }

 public void SetQuantity()
 {
 objBeverage.Quantity = "Full Cup";
 }

 public void SetHotorCold()
 {
 objBeverage.HotorCold = "Hot";
 }

 public void SetIngredients()
 {
 objBeverage.Ingredients.Add("Water");
 objBeverage.Ingredients.Add("Coffee Beans");
 }

 public Beverage GetBeverage()
 {
 return objBeverage;
 }
}


// Concrete Builder Class 2

public class TeaBuilder : IBeverageBuilder
{
 Beverage objBeverage = new Beverage();
 public void SetDrinks()
 {
 objBeverage.Drinks = "Tea";
 }

 public void SetType()
 {
 objBeverage.Type = "Hot Tea";
 }

 public void SetQuantity()
 {
 objBeverage.Quantity = "Half Cup";
 }

 public void SetHotorCold()
 {
 objBeverage.HotorCold = "Cold";
 }

 public void SetIngredients()
 {
 objBeverage.Ingredients.Add("Water");
 objBeverage.Ingredients.Add("Tea Powder");
 objBeverage.Ingredients.Add("Milk");
 objBeverage.Ingredients.Add("Ice");
 }

 public Beverage GetBeverage()
 {
 return objBeverage;
 }
}

// The 'Product' class defined below

public class Beverage
{
 public string Drinks { get; set; }
 public string Type { get; set; }
 public string Quantity { get; set; }
 public string HotorCold { get; set; }
 public List<string> Ingredients { get; set; }

 public Beverage()
 {
 Ingredients = new List<string>();
 }

 public void ShowInfo()
 {
 Console.WriteLine("Beverage    : {0}", Drinks);
 Console.WriteLine("Type        : {0}", Type);
 Console.WriteLine("HotorCold   : {0}", HotorCold);
 Console.WriteLine("Quantity    : {0}", Quantity);
 Console.WriteLine("Ingredients :");
 foreach (var ingredient in Ingredients)
 {
 Console.WriteLine("    -   \t {0}", ingredient);
 }
 }
}

// The 'Director' class defined below

public class BeverageCreator
{
 private readonly IBeverageBuilder objBuilder;

 public BeverageCreator(IBeverageBuilder builder)
 {
 objBuilder = builder;
 }

 public void CreateBeverage()
 {
 objBuilder.SetDrinks();
   objBuilder.SetType();
 objBuilder.SetHotorCold();
 objBuilder.SetQuantity();
 objBuilder.SetIngredients();
 }

 public Beverage GetBeverage()
 {
 return objBuilder.GetBeverage();
 }
}

class Program
{
 static void Main(string[] args)
 {
 var beverageCreator = new BeverageCreator(new CoffeeBuilder());
 beverageCreator.CreateBeverage();
 var beverage = beverageCreator.GetBeverage();
 beverage.ShowInfo();

 Console.WriteLine("---------------------------------------------");

 beverageCreator = new BeverageCreator(new TeaBuilder());
 beverageCreator.CreateBeverage();
 beverage = beverageCreator.GetBeverage();
 beverage.ShowInfo();

 Console.ReadKey();
 }
}
}
