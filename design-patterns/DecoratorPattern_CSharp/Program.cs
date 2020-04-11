
using System;
using System.Collections.Generic;

namespace DecoratorDemo.Component
{

  // Interface ICellPhone
    public interface ICellPhone
    {
        string CalculateDiscount  { get; }
        double GetPrice();
    }

//Concrete component Samsung to implement ICellPhone

public sealed class Samsung_A9 : ICellPhone
    {
        public string CalculateDiscount
        {
            get { return "Samsung"; }
        }
        public double GetPrice()
        {
            return 50000;
        }
    }


//Concrete component iPhone_pro to implement ICellPhone

public sealed class iPhone_pro : ICellPhone
   {
       public string CalculateDiscount
       {
           get { return "iPhone"; }
       }
       public double GetPrice()
       {
           return 100000;
       }
   }

//Decorator Class CellPhoneDecorator  to decorate the Icellphone

   public abstract class CellPhoneDecorator  : ICellPhone
     {
         private ICellPhone cellphone ;
         public CellPhoneDecorator (ICellPhone CellPhone )
         {
             cellphone  = CellPhone ;
         }
         public string CalculateDiscount  { get { return cellphone .CalculateDiscount ; } }

         public double GetPrice()
         {
             return cellphone .GetPrice();
         }
         public abstract double GetDiscountedPrice();
     }

// Concrete Decorator OfferPrice to decorate the Icellphone  using CellPhoneDecorator

     public class OfferPrice : CellPhoneDecorator
       {
           public OfferPrice(ICellPhone cellphone ) : base(cellphone )
           {
           }
           public override double GetDiscountedPrice()
           {
               return .8 * base.GetPrice();
           }
       }

// Use of cellphone  decorator in the main program to achieve the output
       class Program
     {
         static void Main(string[] args)
         {
             ICellPhone cellphone  = new iPhone_pro();
             CellPhoneDecorator  decorator = new OfferPrice(cellphone );
             Console.WriteLine(string.Format("CalculateDiscount  :{0}  Price:{1} " +
                 "DiscountPrice : {2}"
                 , decorator.CalculateDiscount ,  decorator.GetPrice().ToString(),
                 decorator.GetDiscountedPrice().ToString()));
             Console.ReadLine();
         }
     }

     }
