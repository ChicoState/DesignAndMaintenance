using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace PrototypeDesignPattern
{
    class Diagram
    {
        static void Main(string[] args)
        {
            Figure fig1 = new Figure();
            fig1.Name = "Circle";
            fig1.Color = "Red";
            Figure fig2 = fig1.GetClone();
            fig2.Name = "Triangle";

            Console.WriteLine("Figure 1: ");
            Console.WriteLine("Name: " + fig1.Name + ", Color: " + fig1.Color);
            Console.WriteLine("Figure 2: ");
            Console.WriteLine("Name: " + fig2.Name + ", Color: " + fig2.Color);
            Console.Read();
        }
    }
    public class Figure
    {
        public string Name { get; set; }
        public string Color { get; set; }
        public Figure GetClone()
        {
            return (Figure)this.MemberwiseClone();
        }
    }
}
