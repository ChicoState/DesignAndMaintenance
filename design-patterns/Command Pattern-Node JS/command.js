class Math {
  constructor(num) {
    this._num = num;
  }
  square() {
    return this._num ** 2;
  }

  cube() {
    return this._num ** 3;
  }
}

class Command {
  constructor(subject) {
    this._subject = subject;
    this.commandsExecuted = [];
  }
  execute(command) {
    this.commandsExecuted.push(command);
    return this._subject[command]();
  }
}

let x = new Command(new Math(5));
x.execute('square');
x.execute('cube');

console.log(x.commandsExecuted);

