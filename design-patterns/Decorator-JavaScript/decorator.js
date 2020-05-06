
function Mobile() {
    this.cost = function () {
        return 999;
    };
}

function RAM(mob, count) {
    var v = mob.cost();
    mob.cost = function () {
        return v + (count * 75);
    }
}

function CPU(mob, count) {
    var v = mob.cost();
    mob.cost = function () {
        return v + (count * 200);
    };
}


function GPU(mob, count) {
    var v = mob.cost();
    mob.cost = function () {
        return v + (count * 100);
    };
}

function Memory(mob, count) {
    var v = mob.cost();
    mob.cost = function () {
        return v + (count * 100);
    };
}

function Insurance(mob, count) {
    var v = mob.cost();
    mob.cost = function () {
        return v + (count * 20);
    };
}


function run() {
    var sto = document.getElementById('sto').value;
    var mem = document.getElementById('mem').value;
    var cpu = document.getElementById('cpu').value;
    var gpu = document.getElementById('gpu').value;
    var war = document.getElementById('war').value;

    var mob = new Mobile();

    Memory(mob, sto);
    RAM(mob, mem);
    CPU(mob, cpu);
    GPU(mob, gpu);
    Insurance(mob, war);

    document.getElementById("output").innerHTML = '<div class="alert alert-success" role="alert"> FINAL COST : $' + mob.cost() + '</div>';

}