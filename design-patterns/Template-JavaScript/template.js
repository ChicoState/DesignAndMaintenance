class Employee {
    constructor(name, salary) {
        this._name = name;
        this._salary = salary;
    }

    work() {
        return this._name + " is " + this.responsibilities();
    }

    getPaid() {
        return this._name + " get's paid $" + (this._salary * 37.5 * 52) + " Anually ($" + this._salary + "/hour) ";
    }
}

class FullTime extends Employee {

    constructor(name, salary) {
        super(name, salary);
    }

    responsibilities() {
        return 'Full-Time Employee';
    }
}

class Intern extends Employee {
    constructor(name, salary) {
        super(name, salary);
    }

    responsibilities() {
        return 'Intern ';
    }
}

const dev = new FullTime('Sam', 50);
console.log(dev.getPaid());
console.log(dev.work());

console.log(' ');

const tester = new Intern('John', 30);
console.log(tester.getPaid());
console.log(tester.work());