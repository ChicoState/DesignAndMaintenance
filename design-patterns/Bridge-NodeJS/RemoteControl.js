class RemoteControl {

constructor(tv) {
	this.tv = tv;
	
}
   

     on() {
        this.tv.on();
    }

    off() {
        this.tv.off();
    }
	
	setChannel(ch) {
        this.tv.tuneChannel(ch);
    }
	
}
module.exports = RemoteControl;