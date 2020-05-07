The implementation of Bridge Design Pattern discussed in the messaging system model example, demonstrates the Bridge Pattern. <br>
* The interface Message controls the other two hierarchies (Text Message and Multimedia message). <br>
* It maintains a reference to an object that is delegated by Message. <br>
* To extend the Message without changing the implementation class, we use TextMessageSender and MultimediaMessageSender. <br>  
* The MessageSender typically provides the primitive operations while the Message defines the higher level operations based on those primitives. <br>
* In conclusion, the Bridge pattern is used to separate the interface, Message, from its implementation at the onset of a new Interface design which is the MessageSender.

The implemented code for Bridge can be found [here](bridge.rb) <br>
![UML - Bridge - Design Pattern](bridge.png "UML - Prototype - Design Pattern")
