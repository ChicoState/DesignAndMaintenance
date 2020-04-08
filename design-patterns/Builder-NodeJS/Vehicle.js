const VehicleBuilder = require('./VehicleBuilder');
class Vehicle {



    constructor(VehicleBuilder) {
        this.wheels = VehicleBuilder.wheels;
        this.frame = VehicleBuilder.frame;
        this.door = VehicleBuilder.door;
        this.engine = VehicleBuilder.engine;
    }
}
module.exports =  Vehicle;
