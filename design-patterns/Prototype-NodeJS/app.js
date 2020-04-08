const Customer = require('./Customer');
const CustomerProtoType = require('./CustomerProtoType');


var proto = new Customer("Nick", "Anderson", 20);
var prototype = new CustomerProtoType(proto);

var customer = prototype.clone();
customer.getId();
console.log("Customer Data");

console.log("Name : " +  customer.getName() + " ID : " + customer.getId());
