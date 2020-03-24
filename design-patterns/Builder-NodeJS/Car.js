const CarBuilder = require('./CarBuilder');
class Car {



    constructor(CarBuilder) {
        this.wheels = CarBuilder.wheels;
        this.frame = CarBuilder.frame;
        this.door = CarBuilder.door;
        this.engine = CarBuilder.engine;
    }
}
module.exports =  Car;
