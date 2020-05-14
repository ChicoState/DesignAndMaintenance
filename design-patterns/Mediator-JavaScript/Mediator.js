function Secret(name) {
    this.name = name
    this.server = null
}

function Agency() {
    this.person = {}
}

Secret.prototype = {
    sendEnc: function(message, toAgent) {
        var encrypted = CryptoJS.AES.encrypt(message, "IxBha");
        this.server.send(encrypted, this, toAgent)
    },
    receiveEnc: function(message, fromPerson) {
        var mes = message;
        var decrypted = CryptoJS.AES.decrypt(message, "IxBha");
        var dec = decrypted.toString(CryptoJS.enc.Utf8);
        console.log(fromPerson.name + " -> " + this.name);
        console.log("Encrypted Message: " + mes);
        console.log("Decrypted Received Message: " + dec);
        console.log(' ');

    }
}

Agency.prototype = {
    newAgent: function(member) {
        this.person[member.name] = member
        member.server = this
    },
    send: function(message, fromPerson, toAgent) {
        toAgent.receiveEnc(message, fromPerson)
    }
}

const Agent = new Agency()

const s = new Secret("Sam")
const r = new Secret("John")

Agent.newAgent(s)
Agent.newAgent(r)

s.sendEnc("Hi peter", r)
r.sendEnc("What's up, mike", s)