The implementation of prototype discussed in the Laptop model example demonstrates the prototype pattern.<br>
* This pattern suggests that we copy the exiesing object without making our code dependent on the parent class. <br>
* The prototype pattern assigns the cloning process to the objects that are being cloned. <br>
* We have the main interface Computer that helps other objects to clone. The other two classes Laptop1 and Laptop2 clone from the computer class without copying the code. <br>
* These classes use the clone method to bring the field values of the old object to the new ones. <br>

The implemented code for prototype can be found [here](prototype.rb) <br>
![UML - Prototype - Design Pattern](prototype.png "UML - Prototype - Design Pattern")