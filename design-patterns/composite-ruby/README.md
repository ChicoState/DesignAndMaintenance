The implementation of composite discussed in the Gym Management mode example demonstrates the composite pattern.<br>
* This pattern suggests that methods run recursively deep into the hierarchical tree structure until every leaf is covered and then the results are summed up.<br>
* In this example we consider managerial role of all organization as a composite object in a tree structure and each of these structures is treated as an individual object.<br>
* The various composite objects here are Director, Manager, Student Lead, Student Employee in the respective hierarchical order.<br>
* The Manager object would simply return all the student leads and student employees working under him.<br>

The implemented code for composite can be found [here](composite.rb) <br>
![UML - Composite - Design Pattern](composite.png "UML - Composite - Design Pattern")
