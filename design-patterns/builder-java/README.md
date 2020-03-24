# Builder Pattern

Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

# UML
![Builder Pattern](example/uml.gif)

# Java Example

In this example we are attempting to build a product, which is a Phone. The `Phone` class [Phone.java]