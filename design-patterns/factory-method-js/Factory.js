function Company() {

    this.newDev = function (type) {

        var dev;

        if (type === "Intern") {
            dev = new Intern();
        }
        else if (type === "SD1") {
            dev = new SD1();
        }
        else if (type === "SD2") {
            dev = new SD2();
        }

        dev.type = type;

        dev.add = function () {
            output.appendMsg(this.type + " : " + this.msg + " ");
        }

        return dev;
    }
}

var Intern = function () {
    this.msg = "Internal Application";
};

var SD1 = function () {
    this.msg = "Code will be forwarded to Sr. Developer";
};

var SD2 = function () {
    this.msg = "Code will go to Production";
};

var output = (function () {
    var output = "";
    return {
        appendMsg: function (msg) { output += msg + "<br>"; },
        showMsg: function () {
            document.getElementById('msg').innerHTML = output;
            output = "";
        }
    }
})();

function driver() {
    var dev = [];
    var company = new Company();

    dev.push(company.newDev("Intern"));
    dev.push(company.newDev("SD1"));
    dev.push(company.newDev("SD2"));


    for (var i = 0, len = dev.length; i < len; i++) {
        dev[i].add();
    }

    output.showMsg();
}