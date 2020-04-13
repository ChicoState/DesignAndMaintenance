using System;
using System.Collections.Generic;
using CompositeDesignPattern.Component;
using CompositeDesignPattern.Composite;
using CompositeDesignPattern.Leaf;

namespace CompositeDesignPattern.Component
{

// An interface IDepartment - Component
   public interface IDepartment
   {
       void GetDetails(int indentation);
   }
}

// Manufacturer Class to implement the interface component
namespace CompositeDesignPattern.Leaf
{
    public class Manufacturer : IDepartment
    {
        public Manufacturer(string name, string dept)
        {
            this.Name = name;
            this.Department = dept;
        }

        public string Name { get; set; }
        public string Department { get; set; }

        public void GetDetails(int indentation)
        {
            Console.WriteLine(string.Format("{0}- Name:{1}, Dept:{2} (Leaf) ",
                new String('-', indentation), this.Name.ToString(),
                this.Department));

        }
    }
}

/* Create ShowRoomDepartment Class which is the composite and
implement the interface component and add the subordinates as shown below.*/

namespace CompositeDesignPattern.Composite
{
    public class ShowRoomDepartment : IDepartment
    {
        public List<IDepartment> SubOrdinates;
        public ShowRoomDepartment(string name, string dept)
        {
            this.Name = name;
            this.Department = dept;
            SubOrdinates = new List<IDepartment>();
        }
        public string Name { get; set; }
        public string Department { get; set; }
        public void GetDetails(int indentation)
        {
            Console.WriteLine();
            Console.WriteLine(string.Format("{0}+ Name:{1}, " +
                "Dept:{2} - ShowRoomDepartment(Composite)",
                new String('-', indentation), this.Name.ToString(),
                this.Department));
            foreach (IDepartment component in SubOrdinates)
            {
                component.GetDetails(indentation + 1);
            }
        }
    }
}

//Switch to the client which is main program and implement the code

namespace CompositeDesignPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            IDepartment Sony = new Manufacturer("Sony", "Television");
            IDepartment Panasonic = new Manufacturer("Panasonic", "Television");
            IDepartment LG = new Manufacturer("LG", "Refrigerator");
            IDepartment Samsung = new Manufacturer("Samsung", "Refrigerator");

            IDepartment LCD_Screen = new ShowRoomDepartment("LCD_Screen", "Television")
            { SubOrdinates = { Sony, Panasonic } };
            IDepartment Double_Door = new ShowRoomDepartment("Double_Door", "Refrigerator")
            { SubOrdinates = { LG, Samsung} };

            IDepartment TV = new ShowRoomDepartment("TV", "Fridge")
            { SubOrdinates = { LCD_Screen, Double_Door } };
            LCD_Screen.GetDetails(1);
            Double_Door.GetDetails(1);
            Console.ReadLine();
        }
    }
}
