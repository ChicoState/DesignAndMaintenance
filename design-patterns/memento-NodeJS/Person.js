
class Person {

  constructor(name, id) {
      this.name = name;
      this.userId = id;

  }
  getId() {
    return this.userId;
  }
  getName() {
    return this.name;
  }
  saveState() {
        var memento = JSON.stringify(this);
        return memento;
    }
 
    revealState(memento) {
        var data = JSON.parse(memento);
        this.userId = data.userId;
	}
       
}
module.exports = Person;
