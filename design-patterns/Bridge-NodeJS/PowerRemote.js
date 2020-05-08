/* Newer, Better Remote Control */
const RemoteControl = require('./RemoteControl') ;
class PowerRemote {
	constructor(tv) {
		this.tv = tv;
		this.channel = 10;
		
	}
	setChannel(channel) {
		this.channel = channel;
		this.tv.tuneChannel(channel);
	}
	
	nextChannel(channel) {
		this.setChannel(this.channel + 1);
	}
	prevChannel(channel) {
		this.setChannel(this.channel - 1);
	}
	on() {
        this.tv.on();
    }

    off() {
        this.tv.off();
    }
	
	
	} 
	
	
	
	module.exports = PowerRemote;
	

