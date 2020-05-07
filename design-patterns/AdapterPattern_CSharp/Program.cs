//Example of Adapter Pattern - Computer Science Department CSU Chico

using System;
using System.Collections.Generic;

// The 'Client' class

public class Directory
{
 private ITarget facultySource;

 public Directory(ITarget  facultySource)
 {
 this. facultySource =  facultySource;
 }

 public void ShowFacultyList()
 {
 List<string>  faculty =  facultySource.GetFacultyList();

 //Implementation of business logic

 Console.WriteLine("CSU Computer Science Department_Faculty/staff - ");

 foreach (var item in  faculty)
 {
 Console.Write(item);
 }

 }
}

// The 'ITarget' interface

public interface ITarget
{
 List<string> GetFacultyList();
}

// The 'Adaptee' class

public class DeptSystem
{
 public string[][] GetFaculty()
 {
 string[][]  faculties = new string[4][];

  faculties[0] = new string[] { "OCNL 407", "Seema Sehrawat", "Interim Associate Dean" };
  faculties[1] = new string[] { "OCNL 215A", "Tyson Henry", "Chair" };
  faculties[2] = new string[] { "OCNL 208", "Brian Herring", "Lecturer" };
  faculties[3] = new string[] { "OCNL 443", "Michel", "Lab Assistant" };

 return  faculties;
 }
}

/// The 'Adapter' class

public class FacultyAdapter : DeptSystem, ITarget
{
 public List<string> GetFacultyList()
 {
 List<string>  facultyList = new List<string>();
 string[][]  faculties = GetFaculty();
 foreach (string[]  faculty in  faculties)
 {
  facultyList.Add( faculty[0]);
  facultyList.Add(",");
  facultyList.Add( faculty[1]);
  facultyList.Add(",");
  facultyList.Add( faculty[2]);
  facultyList.Add("\n");
 }

 return  facultyList;
 }
}

// Adapter Design Pattern Demo

class Program
{
 static void Main(string[] args)
 {
 ITarget Itarget = new FacultyAdapter();
 Directory client = new Directory(Itarget);
 client.ShowFacultyList();

 Console.ReadKey();

 }
}
