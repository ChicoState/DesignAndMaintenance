# Abstract Factory

Abstract Factory is a creational design pattern that provides interfaces for creating related groups of objects without specifying concrete classes. An Abstract Factory ensures that the look-and-feel standards remain the same; thus, a client may interact with the abstract factory and abstract product interfaces, but will not interact or alter the implementation of the concrete factory and products themselves. In addition, the client does not need to be concerned with any dependencies between the concrete classes, because Abstract Factory automatically enforces them.

A practical use of the Abstract Factory pattern could be for a magazine publisher. The magazine includes content and ads, with both following the same pattern for the publisher -- the content and ads are all composed of text and an image. Here is a UML illustration of an Abstract Factory applied to a publisher.
