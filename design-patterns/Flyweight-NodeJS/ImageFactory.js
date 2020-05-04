const Image = require('./Image') ;
class ImageFactory {
	constructor() {
		
		this.flyweight = {};
		
	}
	
	getImage(dimension, color, fill) {
		if (!this.flyweight[dimension +  color + fill]) {
			this.flyweight[dimension +  color + fill] = new Image(dimension, color, fill);
		} 
		return this.flyweight[dimension +  color + fill];
	}
	 getCount() {
            var count = 0;
            for (var f in this.flyweight) count++;
            return count;
        }
	
}
module.exports = ImageFactory;