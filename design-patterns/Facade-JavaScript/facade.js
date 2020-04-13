var FlightAvail = function (src) {
    this.src = src;
}

var Delta = function () {
    this.check = function (src, loc) {
        var source = "San Francisco";
        var dest = "Mumbai";
        if (src == source && dest == loc) {
            return true;
        }
        return false;
    }
}

var United = function () {
    this.check = function (src, loc) {
        var source = "San Francisco";
        var dest = "Mumbai";
        if (src == source && dest == loc) {
            return true;
        }
        return false;
    }
}

var CathayPacific = function () {
    this.check = function (src, loc) {
        var source = "San Francisco";
        var dest = "London";
        if (src == source && dest == loc) {
            return true;
        }
        return false;
    }
}

FlightAvail.prototype = {

    checkFor: function (location) {

        var result = "<div class='alert alert-danger' role='alert'>" + this.src + " to " + location + " flights are Not Availabe </div>";

        if (new Delta().check(this.src, location)) {

            result = "Available on Delta Airlines";
            return '<div class="alert alert-success" role="alert">' + this.src + " to " + location +
                " flights are " + result + '</div>';
        }
        else if (new United().check(this.src, location)) {

            result = "Available on United Airlines";
            return '<div class="alert alert-success" role="alert">' + this.src + " to " + location +
                " flights are " + result + '</div>';
        }
        else if (new CathayPacific().check(this.src, location)) {

            result = "Available on Cathay Pacific Airlines";
            return '<div class="alert alert-success" role="alert">' + this.src + " to " + location +
                " flights are " + result + '</div>';
        }

        return result;

    }
}

function run() {

    var source = document.getElementById('flightSrc').value;
    var destination = document.getElementById('flightDes').value;
    var flightAvail = new FlightAvail(source);
    var result = flightAvail.checkFor(destination);

    // alert(result);

    document.getElementById("output").innerHTML = result;

}