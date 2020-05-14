const Person = require('./Person');
const DataStore = require('./DataStore');

 var user1 = new Person("James Presley", "James_101");
   console.log(" Original User id is : " + user1.getId());
    var dataStore = new DataStore();
 
    // save state
 
    dataStore.addData(1, user1.saveState());
   
    // altering user id
 
    user1.userId = "MIS_20";
   console.log(" User id changed : " + user1.getId());
 
    // restore original state
 
    user1.revealState(dataStore.getData(1));
	console.log(" Restored User id is : " + user1.getId());