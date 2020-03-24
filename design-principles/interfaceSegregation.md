# SOLID: Interface Segregation Principle

*Shelley Wong, Piradeepan Nagarajan, Chetan Sai Kurra*

## Formal Definition

### Existing Definition
Clients should not be forced to depend upon interfaces that they do not use.

### Our Definition
An interface should only include the methods that are directly related to the given task. It is better to have many small interfaces rather than a few large interfaces.

## Real World Examples

### User interface: car dashboard screen
* Different users prioritize different information
* A simple view is often preferable
* Some functionalities aren’t used on a regular basis, so those would just clutter the screen.

### Class interface: ice cream makers
* All share the same basic purpose (making ice cream) but other features and methods are not shared
* Different options for ice cream, gelato, or sorbet
* Self-refrigerating vs freezer bowl, ice or rock salt (mutually exclusive options, so no reason to have both)

## Motivation

* When the parts of a system are kept separate and distinct, it is easier to restructure, make changes, and quickly deploy the update to that component without affecting other parts of the system  
* If a method is specific to one class, it doesn’t make sense to also require changes in other classes to account for the changes to the first class (if an interface is shared, all classes which connect with that interface might need updating when anything changes)
* Greater flexibility since parts of the larger interface can be implemented in different ways.
* When interfaces are more connected, it could result in the need for updates to interfaces unrelated to the initial change.
* Small and client-specific interfaces are easier to use and maintain.
* Instead of having polluted interfaces with dummy methods, we can split it into small interfaces and have a flexible design.

## References

* [Wikipedia](https://en.wikipedia.org/wiki/Interface_segregation_principle)
* [Stackify](https://stackify.com/interface-segregation-principle/)
* [JRebel](https://www.jrebel.com/blog/solid-principles-in-java)
* [edureka!](https://www.edureka.co/blog/solid-principles-in-java/)