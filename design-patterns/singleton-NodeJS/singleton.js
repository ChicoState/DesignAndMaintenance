var User = (function() {
	var instance;

  function createInstance() {
    instance = this;
    this.class = 'CSCI-611';
		this.university = 'CSU Chico';   
    return instance;
  }
    return {
      getInstance: function () {
          if (!instance) {
              instance = createInstance();
          }
          return instance;
      }
  };
})();

function run() {

  var instance1 = User.getInstance();
  var instance2 = User.getInstance();
  alert(instance1.class);
  alert(instance2.university);
  if(instance1 === instance2){
  alert("Same instance");
  }
  else{
    alert("Different instance");
  }  
}