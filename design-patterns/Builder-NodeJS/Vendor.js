const VehicleBuilder = require('./VehicleBuilder')
const CarBuilder = require('./CarBuilder')
const MotorCycleBuilder = require('./MotorCycleBuilder')
class Vendor {
  this.vendorName = "";
  manufacture(builder) {
    return builder.build();
  }
}
module.exports = Vendor;
