class StockObserver {

	constructor(data) {
		this.data = data;
	}
	notifyStock() {
		console.log('\t Observer notified the stock remaining for ' + this.data);


	}


}

module.exports = StockObserver;
