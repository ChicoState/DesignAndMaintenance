class SamsungTV  {
    on() {
        console.log('Samsung TV is on');
    }

    off() {
        console.log('Samsung TV is off');
    }

    tuneChannel(channel) {
        console.log('Samsung TV tuned to channel ' + channel);
    }
}
module.exports = SamsungTV;

