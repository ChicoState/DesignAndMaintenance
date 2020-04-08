const ImageFactory = require('./ImageFactory') ;
var img = new ImageFactory();
// Image inserted
img.getImage(300, 100, 100);
 
 
 console.log("New Image created => count : " +img.getCount());
 img.getImage(300, 100, 100);
 console.log("Same image  created => count : " +img.getCount());
 
 
 
 // New image creation
 img.getImage(300, 200, 100);
 console.log("New Image created => count : " + img.getCount());
 


