const Department = require('./Department');
class DepartmentFactory {
      create(name, id) {
          return new Department(name, id);

      }

}
module.exports = DepartmentFactory;
