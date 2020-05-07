
const SonyTV = require('./SonyTV') ;
const SamsungTV = require('./SamsungTV') ;
const RemoteControl = require('./RemoteControl') ;
const PowerRemote = require('./PowerRemote') ;

var sony = new SonyTV(),
    samsung = new SamsungTV(),
    stdRemote = new RemoteControl(sony),
    pwrRemote = new PowerRemote(samsung);

stdRemote.on();            
stdRemote.setChannel(80);  
stdRemote.setChannel(12);  
stdRemote.off();           

pwrRemote.on();            
pwrRemote.setChannel(80);  
pwrRemote.nextChannel();  
pwrRemote.prevChannel();  
pwrRemote.off();    