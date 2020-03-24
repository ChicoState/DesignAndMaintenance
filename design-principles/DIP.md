#Dependency inversion principle

*Diksha Pande, Devam Sharma, Pratiksha Kapse*

##Definition:
The principle states: 
* High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces).
* Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

By also making the implementation depend on an interface, you get the possibility to choose at run-time which implementation 
is better suited for your particular environment. Depending on the cases, this may be interesting too.
Dependency inversion pattern:
With the addition of an abstract layer, both high- and lower-level layers reduce the traditional dependencies from top to bottom. 
Nevertheless, the "inversion" concept does not mean that lower-level layers depend on higher-level layers. Both layers should 
depend on abstractions that draw the behavior needed by higher-level layers.


##Example:
Suppose Manager of a company has different types of employees. Few employees are developers,some are Testers, few others are UI designers. 
So, first if everything is exposed about the lower layer to the upper layer, this means Manager must already know about the type of the 
workers that he can supervise. Now if another type of worker comes under the manager, we have to make changes to the whole class.
Now by creating an abstraction between employees and manager, we can directly add the new employee without changing any code for manager.
In this way by adding abstraction we are implementing Dependency inversion pattern.


##Motive:
* No class should hold a reference to a concrete class and no class should derive from a concrete class.
* Changes are risky, and by depending on a concept instead of on an implementation, you reduce the need for change at call sites.


##References:
* Wikipedia: https://en.wikipedia.org/wiki/Dependency_inversion_principle
* Deviq: https://deviq.com/dependency-inversion-principle/
* Stackify: https://stackify.com/dependency-inversion-principle/

