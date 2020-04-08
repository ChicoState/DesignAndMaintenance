const MotorCycle = require('./MotorCycle') ;

class MotorCycleBuilder {



    constructor(vehicleType) {
      this.vType = vehicleType;
    }

    setWheels(wheelz) {
        this.wheels = wheelz;
        return this;
    }

    setEngine(engineCC) {
        this.engine = engineCC;
        return this;
    }

	  setDoors(doorNum) {
        this.door = doorNum;
        return this;
    }

    setFrame(vFrame) {
        this.frame = vFrame;
        return this;
    }


    build() {
        return new MotorCycle(this);
    }

    get getWheels() {
        return this.wheels;
    }

    get getEngine() {
        return this.engine;
    }

    get getFrame() {
        return this.frame;
    }
    get getDoors() {
        return this.door;
    }



}

module.exports = MotorCycleBuilder;
