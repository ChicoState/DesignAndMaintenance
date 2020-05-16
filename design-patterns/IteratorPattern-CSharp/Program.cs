using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace Iterator_Design_Pattern
{

  // Create the collection item
    class Professor
    {
        public int CourseID { get; set; }
        public string CourseName { get; set; }
        public Professor(string name, int courseid)
        {
            CourseName = name;
            CourseID = courseid;
        }
    }

 //Creating Abstract Iterator

 interface AbstractIterator
    {
         Professor First();
         Professor Next();
         bool IsCompleted { get; }
    }


// Creating Concrete Iterator

class Iterator : AbstractIterator
    {
        private ConcreteCollection collection;
        private int current = 0;
        private int step = 1;
        // Constructor
        public Iterator(ConcreteCollection collection)
        {
            this.collection = collection;
        }
        // Gets first item
        public Professor First()
        {
            current = 0;
            return collection.GetProfessor(current);
        }
        // Gets next item
        public Professor Next()
        {
            current += step;
            if (!IsCompleted)
            {
                return collection.GetProfessor(current);
            }
            else
            {
                return null;
            }
        }
        // Check whether iteration is complete
        public bool IsCompleted
        {
            get { return current >= collection.Count; }
        }
    }

 // Creating Aggregate

 interface AbstractCollection
    {
        Iterator CreateIterator();
    }

  // Creating ConcreteAggregate


  class ConcreteCollection : AbstractCollection
    {
        private List<Professor> listProfessors = new List<Professor>();
        //Create Iterator
        public Iterator CreateIterator()
        {
            return new Iterator(this);
        }
        // Gets item count
        public int Count
        {
            get { return listProfessors.Count; }
        }
        //Add items to the collection
        public void AddProfessor(Professor professor)
        {
            listProfessors.Add(professor);
        }
        //Get item from collection
        public Professor GetProfessor(int IndexPosition)
        {
            return listProfessors[IndexPosition];
        }
    }

    public class Program
    {
        static void Main()
        {
            // Build a collection
            ConcreteCollection collection = new ConcreteCollection();
            collection.AddProfessor(new Professor("Dr.J", 310));
            collection.AddProfessor(new Professor("Prof. Sue", 301));
            collection.AddProfessor(new Professor("Dr. Renne", 611));
            collection.AddProfessor(new Professor("Dr. Kevin", 630));
            collection.AddProfessor(new Professor("Prof. Brian", 465));
            collection.AddProfessor(new Professor("Prof. David", 448));

            // Create iterator
            Iterator iterator = collection.CreateIterator();
            //looping iterator
            Console.WriteLine("Iterating over collection:");

            for (Professor prof  = iterator.First(); !iterator.IsCompleted; prof  = iterator.Next())
            {
                Console.WriteLine($"CourseID : {prof .CourseID} & CourseName : {prof .CourseName}");
            }
            Console.Read();
        }
    }

 }
