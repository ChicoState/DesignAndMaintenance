# Proxy

In OOP, the decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without canging the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.<br>
The decorator pattern is structurally nearly identical to the chain of responsibility pattern, the difference being that in a chain of responsibility, exactly one of the classes handles the request, while for the decorator, all classes handle the request.<br>

![UML of Laptop class implemented as a Decorator](Decorator_uml.png "UML class diagram of Proxy Design Pattern")


## Running the Example

To execute the program from command line, please use the following command:

```{bash}
% ruby decorator_design_pattern.rb
Asus Rog Zephrus G14
Parts: RAM =16 GB ROM = 2 GB Solid State Drive = 2 TB Graphics Card = 6 GB
Cost = $1490
```
