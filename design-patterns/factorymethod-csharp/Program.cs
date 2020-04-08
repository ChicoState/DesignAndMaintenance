using System;
using System.Collections.Generic;

// FactoryMethod container for all the classes in program
namespace FactoryMethod
{
    class Program
    {
        static void Main(string[] args)
        {
            //This can be used as a singleton object
            ObjectFactory objectFactory = new ObjectFactory();
            Dictionary<String, Object> data = new Dictionary<string, object>();
            data.Add("Code", 1);

            // Implemetation of methods
            RegularCourse course = objectFactory.Get(ObjectType.RegularCourse, data) as RegularCourse;
            PreRequisites prereq = objectFactory.Get(ObjectType.PreRequisites, data) as PreRequisites;

            Console.WriteLine(course.GetCourseInfo());
            Console.WriteLine(prereq.GetCourseInfo());
            Console.ReadLine();
        }
    }

// block to define an objects
    #region Object

    interface IObject
    {
        String GetCourseInfo();
    }

// Class object for the RegularCourse
    class RegularCourse : IObject
    {
        public Int32 CourseCode;
        public String CourseName;
        public String Professor;
        public Int32 Units;
        public String Location;

        public virtual String GetCourseInfo()
        {
            return String.Format("RegularCourse name is --> {0}. Instructor Name is --> {1}. Location is --> {2}. Units are --> {3}.", CourseName, Professor, Location, Units);
        }
    }

// Class object for the PreRequisites
    class PreRequisites : IObject
    {
        public Int32 CourseCode;
        public String CourseName;
        public String Professor;
        public Int32 Units;
        public String Location;

        public virtual String GetCourseInfo()
        {
            return String.Format("PreRequisites name is --> {0}. Instructor Name is --> {1}. Location is --> {2}. Units are --> {3}.", CourseName, Professor, Location, Units);
        }
    }

// ObjectTypes are defined
    enum ObjectType
    {
        RegularCourse,
        PreRequisites
    }

    #endregion Object

// Class to define FactoryMethod objects
    #region Object Factory

    class ObjectFactory
    {
        ObjectType _type;
        Dictionary<String, Object> _data;
        public IObject Get(ObjectType type, Dictionary<String, Object> data)
        {
            _type = type;
            _data = data;
            return GetObject();
        }

        public IObject GetObject()
        {
            IObject obj = null;
            Int32 code = Convert.ToInt32(_data["Code"]);

            //Fetch the object information based on the supplied type and code.
            switch(_type)
            {
                case ObjectType.RegularCourse:
                    //Get the object info from either a database or from a metadata dictionary
                    obj = new RegularCourse() { CourseCode = code, CourseName = "{Computer Security}", Professor = "Prof.David", Units = 3, Location = "OCNL 243" };
                    break;
                case ObjectType.PreRequisites:
                    //Get the object info from either a database or from a metadata dictionary
                    obj = new PreRequisites() { CourseCode = code, CourseName = "{Programming Foundations}", Professor = "Dr. Ben", Units = 6, Location = "OCNL 224" };
                    break;
                default:
                    obj = null;
                    break;
            }

            return obj;
        }
    }

    #endregion Object Factory
}
