using System;
using System.Collections.Generic;

namespace FlyweightPatternDemo
{
    //'Flyweight' inteface
    public interface IGeometry
    {
        // intrinsic state
        void GetShape();
        // extrinsic state
        void GetColor(int size);
    }
    // 'ConcreteFlyweight' class
    public class Circle : IGeometry
    {
        // shape of geometry will be constant - intrinsic state
        public void GetShape()
        {
            Console.WriteLine("This is a Circle shape object");
        }
        // color of geometry will dependent on size - extrinsic state
        public void GetColor(int length)
        {
            if(length < 5)
            {
                Console.WriteLine("Circle is filled with BLUE color");
            }
            else
            {
                Console.WriteLine("Circle is filled with RED color");
            }
        }
    }
    // 'ConcreteFlyweight' class
    public class Square : IGeometry
    {
        // shape of geometry will be constant - intrinsic state
        public void GetShape()
        {
            Console.WriteLine("This is a square shape object");
        }
        // color of geometry will dependent on size - extrinsic state
        public void GetColor(int length)
        {
            if (length < 5)
            {
                Console.WriteLine("Square is filled with BLACK color");
            }
            else
            {
                Console.WriteLine("Square is filled with GREEN color");
            }
        }
    }
    //'FlyweightFactory' class
    public class GeometryFactory
    {
        Dictionary<string, IGeometry> geometries = new Dictionary<string, IGeometry>();
        // returns total number of created objects
        public int ObjectCount()
        {
            return geometries.Count;
        }
        // responsible for creating and managing objects
        public IGeometry getGeometryObject(string name)
        {
            IGeometry geometry;
            if(geometries.ContainsKey(name)){
                return geometries[name];
            }
            else{
                if (name == "Circle")
                {
                    geometry = new Circle();
                    geometries.Add("Circle", geometry);
                }
                else if (name == "Square")
                {
                    geometry = new Square();
                    geometries.Add("Square", geometry);
                }
                else {
                    throw new Exception("This type of object can not be created");
                }
            }
            return geometry;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            GeometryFactory geometryFactory = new GeometryFactory();
            IGeometry geometry = geometryFactory.getGeometryObject("Circle");
            geometry.GetShape();
            geometry.GetColor(9);
            geometry = geometryFactory.getGeometryObject("Circle");
            geometry.GetShape();
            geometry.GetColor(3);
            geometry = geometryFactory.getGeometryObject("Square");
            geometry.GetShape();
            geometry.GetColor(9);
            geometry = geometryFactory.getGeometryObject("Square");
            geometry.GetShape();
            geometry.GetColor(3);
            int ObjectCount = geometryFactory.ObjectCount();
            Console.WriteLine("Total objects created: " + ObjectCount);

            Console.ReadLine();
        }
    }
}
