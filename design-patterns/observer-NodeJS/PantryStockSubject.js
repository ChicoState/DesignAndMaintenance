
class PantryStockSubject{
	constructor() {
		this.observers = []
	}
	addStock (data) {
		this.observers.push(data);

  }

  removeStock (data) {
  var obInd = this.observers.indexOf(data);
  if (obInd > -1) {

		this.observers.splice(obInd, 1);
  }

  }

  notifyObserver(data) {
	  var obInd = this.observers.indexOf(data);
	  if (obInd > -1) {
		this.observers[obInd].notifyStock(obInd);
	}
  }

  notifyAllObservers() {
	  for (var i = 0; i < this.observers.length; i++) {

		  this.observers[i].notifyStock(i);
	  }
  }


}
module.exports = PantryStockSubject;
