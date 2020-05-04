using System;

namespace Proxy
{
    public interface Shape
    {
        string GetShape();
    }

    public class OriginalCircle : Shape
    {
        public void Details()
        {
            Console.WriteLine("This is original Circle Class");
        }
        public string GetShape()
        {
            return "This is Circle shape from real/ actual class";
        }
    }

    public class ProxyCircle : Shape
    {
        Shape shape;
        public void Details()
        {
            Console.WriteLine("This is Proxy Circle Class");
        }
        public string GetShape()
        {
            shape = new OriginalCircle();
            return shape.GetShape();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            ProxyCircle proxyClass = new ProxyCircle();
            proxyClass.Details();
            string OriginalCircleDetails = proxyClass.GetShape();
            Console.WriteLine(OriginalCircleDetails);
            Console.ReadLine();
        }
    }
}
