const EmployeeFactory = require('./EmployeeFactory');
const DepartmentFactory = require('./DepartmentFactory');
const FactoryProvider = require('./FactoryProvider');
/*var list = [];
var employeeFactory = new EmployeeFactory();
var departFactory = new DepartmentFactory();

list.push(employeeFactory.create("Alex", 10));
list.push(employeeFactory.create("Tim", 20));
list.push(departFactory.create("Admin", 30));
list.push(departFactory.create("HR", 40));

for (var i = 0, len = list.length; i < len; i++) {
    console.log(list[i].getName());
    console.log(list[i].getId());
} */

var provider = new FactoryProvider();
var factory = provider.getFactory("Employee");
var emp = factory.create("Alex", 10);
console.log("Printing Employee details");
console.log(" Employee ID : " + emp.getId() + " Employee Name: " + emp.getName());

console.log("\n");
console.log("Printing Department details");
factory = provider.getFactory("Department");
var dept = factory.create("HR", 20);
console.log(" Department ID : " + dept.getId() + " Department Name: " + dept.getName());
