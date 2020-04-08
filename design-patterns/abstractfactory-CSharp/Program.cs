using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
class Meal
{
    static void Main(string[] args)
    {
        Console.WriteLine("Which meal do you want? (V)egeterian or (N)Vegeterian?");
        char input = Console.ReadKey().KeyChar;
        RecipeFactory factory;
        switch(input)
        {
            case 'V':
                factory = new VegChoiceFactory();
                break;

            case 'N':
                factory = new NVegChoiceFactory();
                break;

            default:
                throw new NotImplementedException();

        }

        var sandwich = factory.CreateSandwich();
        var pizza = factory.CreatePizza();

        Console.WriteLine("\nSandwich: " + sandwich.GetType().Name);
        Console.WriteLine("Pizza: " + pizza.GetType().Name);

        Console.ReadKey();
    }
}
}
