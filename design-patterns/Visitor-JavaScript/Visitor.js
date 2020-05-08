function InternetCharge(customer, amount, speed, newSpeed) {
    this.customer = customer
    this.amount = amount
    this.speed = speed
    this.newSpeed = newSpeed
}

InternetCharge.prototype = {
    setNewCharge: function(amount) {
        this.amount = amount
    },
    getOldCharge: function() {
        return this.amount
    },
    getNewSpeed: function() {
        return this.newSpeed
    },
    getOldSpeed: function() {
        return this.speed
    },
    makeChange: function(visitorFunction) {
        visitorFunction(this)
    }
}


var oldCharge = new InternetCharge("Subhed", 50, 200, 250)
console.log("Old Charges: $" + oldCharge.getOldCharge() + " (" + oldCharge.getOldSpeed() + " Mbps)")

function newCharge(user, speed) {
    user.setNewCharge(user.getOldCharge() + ((user.getNewSpeed() - user.getOldSpeed()) * .2))
}

oldCharge.makeChange(newCharge)
console.log("New Charges: $" + oldCharge.getOldCharge() + " (" + oldCharge.getNewSpeed() + " Mbps)")