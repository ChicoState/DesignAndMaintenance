using System;
using System.Collections.Generic;

namespace Observer_Design_pattern
{
  /// Observer Design Pattern.

  class Program

  {

    static void Main()
    {
      // Create PizzaHut rate and attach customers

      PizzaHut pizzahut = new PizzaHut("PizzaHut", 20.00);
      pizzahut.Attach(new Customer("Veg-Pizza"));
      pizzahut.Attach(new Customer("NonVeg-Pizza"));

      // Fluctuating prices will notify customers

      pizzahut.Price = 20.05;
      pizzahut.Price = 21.00;
      pizzahut.Price = 22.50;
      pizzahut.Price = 23.75;

      // Wait for user

      Console.ReadKey();
    }
  }

  /// The 'Subject' abstract class

  abstract class Cost

  {
    private string _symbol;
    private double _price;
    private List<ICustomer> _customers  = new List<ICustomer>();

    // Constructor

    public Cost(string symbol, double price)
    {
      this._symbol = symbol;
      this._price = price;
    }

    public void Attach(ICustomer customer )
    {
      _customers .Add(customer );
    }

    public void Detach(ICustomer customer )
    {
      _customers .Remove(customer );
    }

    public void Update()
    {
      foreach (ICustomer customer  in _customers )
      {
        customer .Update(this);
      }

      Console.WriteLine("");
    }

    // Gets or sets the price

    public double Price
    {
      get { return _price; }
      set

      {
        if (_price != value)
        {
          _price = value;
          Update();
        }
      }
    }

    // Gets the symbol

    public string Symbol
    {
      get { return _symbol; }
    }
  }

  // The 'ConcreteSubject' class

  class PizzaHut : Cost

  {
    // Constructor

    public PizzaHut(string symbol, double price)
      : base(symbol, price)
    {
    }
  }

  // The 'Observer' interface

  interface ICustomer

  {
    void Update(Cost rate);
  }

  // The 'ConcreteObserver' class

  class Customer : ICustomer

  {
    private string _name;
    private Cost _rate;

    // Constructor

    public Customer(string name)
    {
      this._name = name;
    }

    public void Update(Cost rate)
    {
      Console.WriteLine("Updates on price.. {0} of {1}'s " +
        "change to {2:C}", _name, rate.Symbol, rate.Price);
    }

    // Gets or sets the rate

    public Cost Cost
    {
      get { return _rate; }
      set { _rate = value; }
    }
  }
}
