const Employee = require('./Employee');
class EmployeeFactory {
      create(name, id) {
          return new Employee(name, id);

      }

}
module.exports = EmployeeFactory;
