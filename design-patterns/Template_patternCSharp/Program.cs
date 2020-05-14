using System;

namespace TemplatePattern
{
    //'AbstractClass' abstract class
    abstract class Files
    {
        //default steps
        public void OpenFile()
        {
            Console.WriteLine("File opened");
        }
        // steps that will be overidden by subclass
        public abstract void GenerateReport();
        // default step
        public void ExtractData()
        {
            Console.WriteLine("File data extraction");
        }
        //'Template Method'
        public void Miner()
        {
            this.OpenFile();
            this.GenerateReport();
            this.ExtractData();
        }

    }
    //'ConcreteClass'- concrete class
    class PDF : Files
    {
        public override void GenerateReport()
        {
            Console.WriteLine("Report for the PDF file generated");
        }
    }

    //'ConcreteClass' - concrete class
    class CSV : Files
    {
        public override void GenerateReport()
        {
            Console.WriteLine("Report for the CSV file generated");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("File Type::PDF");
            Files fileExporter = new PDF();
            fileExporter.Miner();
            Console.WriteLine("File Type::CSV");
            fileExporter = new CSV();
            fileExporter.Miner();

            Console.ReadLine();
        }
    }
}
