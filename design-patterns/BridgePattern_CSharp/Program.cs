//Example of Bridge Pattern - International Flight reservations
using System;
using System.Collections.Generic;

namespace BridgeDesignPattern
{

// Implementor Interface -  an interface IReservationSystem to ProcessReservation

    public interface IReservationSystem
    {
        void ProcessReservation(string reservationSystem);
    }

// ConcreteImplementor -  Emirates as Reservation  and implement ProcessReservation

public class EmiratesReservationSystem : IReservationSystem
{
    public void ProcessReservation(string reservationSystem)
    {
        Console.WriteLine("Using Emirates airlines for  " + reservationSystem);
    }
}

// ConcreteImplementor -  AirIndia as Reservation  and implement ProcessReservation

public class AirIndiaReservationSystem : IReservationSystem
{
   public void ProcessReservation(string reservationSystem)
   {
       Console.WriteLine("Using AirIndia airlines for  " + reservationSystem);
   }
}

/* Use these reservation airliness and bridge them with International or Domestic reservations.
   Abstraction - Classes of Abstraction and Refined Abstraction implementations. */

public abstract class Reservation
{
    public IReservationSystem _IReservationSystem;
    public abstract void MakeReservation();
}

// RefinedAbstraction -  Refined abstraction class Domestic Reservation and inherit the abstract class Reservation

public class DomesticReservation : Reservation
{
public override void MakeReservation()
{
    _IReservationSystem.ProcessReservation("Domestic Reservation");
}
}

// RefinedAbstraction - Refined abstraction class International Reservation and inherit the Abstract class Reservation

    public class InternationalReservation : Reservation
    {
        public override void MakeReservation()
        {
            _IReservationSystem.ProcessReservation("International Reservation");
        }
    }

// The client which is main program

class Program
{
  static void Main(string[] args)
  {
      Reservation order = new DomesticReservation();
      order._IReservationSystem = new EmiratesReservationSystem();
      order.MakeReservation();

      order._IReservationSystem = new AirIndiaReservationSystem();
      order.MakeReservation();

      order = new InternationalReservation();
      order._IReservationSystem = new EmiratesReservationSystem();
      order.MakeReservation();

      Console.ReadKey();
  }
}
 }
