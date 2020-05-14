class DataStore {
    
	
	constructor() {
		 this.dataObj = {}
	}
   
	addData(key, value) {
		this.dataObj[key] = value;
	}
	 getData(key) {
		return this.dataObj[key];
	 }
	
}
module.exports = DataStore;