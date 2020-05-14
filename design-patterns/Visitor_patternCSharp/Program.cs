using System;
using System.Collections.Generic;
namespace VisitorDesign
{
  public interface IElement
  {
    void Accept(IVisitor visitor);
  }

  public class Boy : IElement
  {
    public string BoyName { get;set;}

      public Boy(string name)
      {
        BoyName = name;
      }
      public void Accept(IVisitor visitor)
      {
        visitor.Visit(this);
      }

  }
  public interface IVisitor
  {
    void Visit(IElement element);
  }
  public class Postman : IVisitor
  {
      public string Name { get;set; }
      public Postman(string name)
      {
        Name = name;
      }
      public void Visit(IElement element)
      {
        Boy boy = (Boy)element;
        Console.WriteLine("Postman: " + this.Name+ " gave the mail to the boy: " + boy.BoyName);
      }
  }
  public class LaundaryPerson : IVisitor
  {
      public string Name { get;set; }
      public LaundaryPerson(string name)
      {
        Name = name;
      }
      public void Visit(IElement element)
      {
        Boy boy = (Boy)element;
        Console.WriteLine("LaundaryPerson: " + this.Name+ " gave the clothes to the boy: " + boy.BoyName);
      }
  }
  public class Society
  {
        private static List<IElement> elements;
        static Society()
        {
            elements = new List<IElement>
            {
                new Boy("Sam"),
                new Boy("Harry"),
                new Boy("Tom")
            };
        }
        public void PerformOperation(IVisitor visitor)
        {
            foreach (var boy in elements)
            {
                boy.Accept(visitor);
            }
        }
  }
  class Program
    {
        static void Main(string[] args)
        {
            Society society = new Society();
            var visitor1 = new Postman("Ian");
            society.PerformOperation(visitor1);
            Console.WriteLine();
            var visitor2 = new LaundaryPerson("David");
            society.PerformOperation(visitor2);
            Console.Read();
        }
    }


}
