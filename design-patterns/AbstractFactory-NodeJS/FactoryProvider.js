const EmployeeFactory = require('./EmployeeFactory');
const DepartmentFactory = require('./DepartmentFactory');
class FactoryProvider {

  getFactory(category) {
      if (category == 'Employee') {
        return new EmployeeFactory();
      } else if (category == 'Department') {
        return new DepartmentFactory();
      }
  }

}
module.exports = FactoryProvider;
