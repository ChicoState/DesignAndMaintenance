using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    abstract class Sandwich { }
    abstract class Pizza { }

    abstract class RecipeFactory
    {
        public abstract Sandwich CreateSandwich();
        public abstract Pizza CreatePizza();
    }

    class Vegchesse : Sandwich { }
    class Veggie : Pizza { }

    class VegChoiceFactory : RecipeFactory
    {
        public override Sandwich CreateSandwich()
        {
            return new Vegchesse();
        }

        public override Pizza CreatePizza()
        {
            return new Veggie();
        }
    }

    class Beaf : Sandwich { }
    class Chicken : Pizza { }

    class NVegChoiceFactory : RecipeFactory
    {
        public override Sandwich CreateSandwich()
        {
            return new Beaf();
        }

        public override Pizza CreatePizza()
        {
            return new Chicken();
        }
    }
}
