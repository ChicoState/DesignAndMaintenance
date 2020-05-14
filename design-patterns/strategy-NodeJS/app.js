const PaymentStrategy = require('./PaymentStrategy.js');
const TeamLead = require('./TeamLead.js');
const ProjectManager = require('./ProjectManager.js');
const SoftwareEngineer = require('./SoftwareEngineer.js');

levels = [];
levels.push("class1", "class2", "intern");
 
    // the 3 strategies
 
    var teamlead = new TeamLead();
    var pm = new ProjectManager();
    var se = new SoftwareEngineer();
 
    var payment = new PaymentStrategy();
 
    payment.setPaymentStrategy(teamlead);
    console.log(" Team Lead payment is => " + payment.calculatePayment(levels[1]));
	payment.setPaymentStrategy(pm);
    console.log(" Project Manager payment is => " + payment.calculatePayment(levels[0]));
	payment.setPaymentStrategy(se);
    console.log(" SoftwareEngineer payment is => " + payment.calculatePayment(levels[2]));
    
 