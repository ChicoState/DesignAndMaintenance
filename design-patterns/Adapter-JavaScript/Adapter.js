class ConvOld {
    constructor() {
        this.convert = function (usdVAL, toCurr) {

            if (toCurr == "toINR") {
                return usdVAL * 76;
            }
            else if (toCurr == "toEUR") {
                return usdVAL * 0.91;
            }
            else if (toCurr == "toYEN") {
                return usdVAL * 108;
            }
            else {
                return 'Invalid Operation';
            }

        };
    }
}

class ConvNew {
    constructor() {
        this.toINR = function (usdVAL) {
            return usdVAL * 78;
        };
        this.toEUR = function (usdVAL) {
            return usdVAL * 0.95;
        };
        this.toYEN = function (usdVAL) {
            return usdVAL * 110;
        };

    }
}

class ConvAdpt {
    constructor() {
        const newCalc = new ConvNew();

        this.convert = function (usdVAL, toCurr) {

            if (toCurr == "toINR") {
                return newCalc.toINR(usdVAL);
            }
            else if (toCurr == "toEUR") {
                return newCalc.toEUR(usdVAL);
            }
            else if (toCurr == "toYEN") {
                return newCalc.toYEN(usdVAL);
            }
            else {
                return 'Invalid Operation';
            }
        };
    }
}


function run() {

    var usdAmt = document.getElementById('usdAmt').value;
    var currConv = document.getElementById('currConv').value;

    var res1;
    var res2;

    const oldCalc = new ConvOld();
    res1 = oldCalc.convert(usdAmt, currConv);


    const newCalc = new ConvNew();
    if (currConv == "toINR") {
        res2 = '₹'+newCalc.toINR(usdAmt);
    }
    else if (currConv == "toEUR") {
        res2 = '€'+newCalc.toEUR(usdAmt);
    }
    else if (currConv == "toYEN") {
        res2 = '¥'+newCalc.toINR(toYEN);
    }

    const adaptedCalc = new ConvAdpt();
    console.log(adaptedCalc.convert(usdAmt, currConv));

    var res = '<div class="alert alert-success" role="alert"> [ NEW ]    $' + usdAmt + " = " + res2 +'</div> <br> <div class="alert alert-danger" role="alert"> [ OLD ]    $' + usdAmt + " = " + res1 +'</div>';

    document.getElementById("output").innerHTML = res;

}

