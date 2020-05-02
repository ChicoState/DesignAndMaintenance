# Template Method Design Pattern
Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.
Suppose we want to provide an algorithm to build a house. The steps need to be performed to build a house are – building foundation, building pillars, building walls and windows. The important point is that the we can’t change the order of execution because we can’t build windows before building the foundation. So in this case we can create a template method that will use different methods to build the house.

Now building the foundation for a house is same for all type of houses, whether its a wooden house or a glass house. So we can provide base implementation for this, if subclasses want to override this method, they can but mostly it’s common for all the types of houses.

To make sure that subclasses don’t override the template method, we should make it final.

# Design Pattern UML
![Template Method Pattern](example/uml1.png)

- Originator: The object for which the state is to be saved. It creates the memento and uses it in future to undo.
- Momento : The object that is going to maintain the state of originator.
- Caretaker : The object that keeps track of multiple memento.

# Java Example
In the example we have a Basic Web Browser. Which is implemntaing the Momento Design Pattern to store, delete and restore browser history.
- [Browser.java](example/Browser.java) is the Originator which Create new Browser Tabs and stores the latest active tab in the browser.
- [CurrentTab.java](example/CurrentTab.java) is the Momento and stores and maintains the current tab information.
- [History.java](example/History.java) is the Caretaker which stores the Browser Tabs history in an ArrayList and a pointer to the last entry.
- [WebBrowser.java](example/WebBrowser.java) is the Client which runs the Browser.

# Example UML
![Browser Pattern](example/uml2.png)


# Use of Design Pattern
- Need an undo and restore mechanism.
- Database rollback. To be able to rollback, have the Originator create a snapshot (memento) before performing an operation and thus in case of failure, the memento object would be used to restore the Originator to its previous state.
- Want to simplify Originator code so it does not need to keep track of its previous state by moving such responsibility to the Caretaker code.