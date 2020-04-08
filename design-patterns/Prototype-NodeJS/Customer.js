class Customer {
  constructor(fName, lName, id) {
    this.firstName = fName;
    this.lastName = lName;
    this.id = id;
  }

  getName() {
    return this.firstName;
  }
  getId() {
    return this.id;
  }

}
module.exports = Customer;
