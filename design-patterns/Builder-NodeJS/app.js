const VehicleBuilder = require('./Vehiclebuilder');
const MotorCycleBuilder = require('./MotorCycleBuilder');
const CarBuilder = require('./CarBuilder');
const Vendor = require('./Vendor');

/* Vendor vendor = new Vendor();

  // Construct and display vehicles

  builder = new CarBuilder();
  shop.manufacture(builder);
  builder.Vehicle.Show();

  builder = new MotorCycleBuilder();
  shop.Construct(builder);
  builder.Vehicle.Show();

  builder = new MotorCycleBuilder();
  shop.Construct(builder);
  builder.Vehicle.Show(); */

console.log("Generic Vehicle Builder....");
const vehicle = new VehicleBuilder('Car')
 .setDoors(4)
 .setFrame("Generic Car Frame")
 .setWheels(4)
 .setEngine("500 CC");

 vendor = new Vendor();
 var genericCar  = vendor.manufacture(vehicle);
 console.log(genericCar);



 console.log("\n");
 console.log("Car Builder....");
 const car = new CarBuilder('Civic')
  .setDoors(4)
  .setFrame("Car Frame")
  .setWheels(4)
  .setEngine("1300 CC");



  var buildCar  = vendor.manufacture(car);
  console.log(buildCar);

  console.log("\n");
  console.log("Motorcycle  Builder....");
  const MotorCycle = new MotorCycleBuilder('Triumph')
   .setDoors(0)
   .setFrame("MotorCycle Frame")
   .setWheels(2)
   .setEngine("500 CC");




   var buildMotor  = vendor.manufacture(MotorCycle);
   console.log(buildMotor);
