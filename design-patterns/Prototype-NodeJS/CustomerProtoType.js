const Customer = require('./Customer');
class CustomerPrototype {

  constructor(proto) {
    this.proto = proto;
  }
  clone() {
      var customer = new Customer();

      customer.firstName = this.proto.firstName;
      customer.lastName = this.proto.lastName;
      customer.id = this.proto.id;

      return customer;
  }
}
module.exports = CustomerPrototype;
