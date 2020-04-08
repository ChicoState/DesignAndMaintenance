const MotorCycleBuilder = require('./MotorCycleBuilder');
class MotorCycle {



    constructor(MotorCycleBuilder) {
        this.wheels = MotorCycleBuilder.wheels;
        this.frame = MotorCycleBuilder.frame;
        this.door = MotorCycleBuilder.door;
        this.engine = MotorCycleBuilder.engine;
    }
}
module.exports =  MotorCycle;
