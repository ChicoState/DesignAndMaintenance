const PantryStockSubject = require('./PantryStockSubject.js');
const StockObserver = require('./StockObserver.js');
const UtilityStock = require('./UtilityStock.js');

var subject = new PantryStockSubject();
var obs1 = new StockObserver('vegetable');
var obs2 = new StockObserver('meat');
var obs3 = new StockObserver('dairy');
var obs4 = new StockObserver('pulp');


/*UtilityStock.prototype = Object.create(StockObserver.prototype);
var stock = new UtilityStock('veg');
stock.notifyStock();
console.log(stock.check());*/

console.log("Adding stock to the pantry " );
console.log("\n " );

subject.addStock(obs1);
subject.addStock(obs2);
subject.addStock(obs3);
subject.addStock(obs4);
console.log("Stock added as to inventory. \n" );
console.log("Check for stock if available ..");
console.log("\n " );
subject.notifyObserver(obs2);

console.log("Removing the stock...")
console.log("\n " );
subject.removeStock(obs2);

console.log("Refreshed stock after removal of item..")
console.log("\n " );

subject.notifyAllObservers();
