Deepali patil, Padam Rana, Gopal Raigoni

# Open Closed Principle
 The Open Closed Principle addresses the "O" of the five SOLID programming building principles to make productive and viable code that is more readable, maintainable, easy to upgrade, and modify.
Robert C. Martin describes it, and he considered this as "the most important principle of object-oriented design."

### Definition :
Bertrand Meyer wrote about it in 1988 in his book Object-Oriented Software Construction. He explained the Open/Closed Principle as:

"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."
Modules that conform to the open-closed principle have two essential attributes.


#### "Open For Extension."
The open close principle implies that the conduct of the module can be extended. As the requirements of the application changes, we can make the changes in the module behavior by implementing new code with the latest features

#### "Closed for Modification."

It means that the source code of such a module stays untouched.
Because making changes directly to those entities may result in unwanted consequences.
It is possible that a bug can be introduced in the system, increasing additional complexity to the system.
The worst-case scenario would be to break the existing system.


### Example

> UML Diagram

![](https://raw.githubusercontent.com/gopalsingh112/cs630.github.io/master/2.jpg)

If we have Airline and you want give a discount of 10% to your all customers using this class: When you decide to offer double the discount to Business class customers. You may modify the class like this:

```python
class Discount:
  def __init__(self, flyer, price):
      self.flyer = flyer
      self.price = price
  def apply_discount(self):
      if self.customer == 'ALL':  # 10% Discount
          return self.price*0.1
      if self.customer == 'BUSINESS': # 20% Discount
          return self.price*0.2
```          
No, this will violate the Open Closed principle. If we want to give a new percent discount to business class customers, you will see that a new logic will be added. To make it follow the Open Close principle, we will create a new class that will extend the Discount class. In this new class, we would implement the business class logic

```python
class Business_Discount(Discount):
  def apply_discount(self):
    return super().apply_discount()*2  # 20% Discount
```
Similarly, if we want give 40% discount to First class customers then 

```python
class First_Discount(Business_Discount):
  def apply_discount(self):
    return super().apply_discount()*2  # 40% Discount
```

Bob Martin expressed it better:

You should be able to extend the behavior of a system without having to modify that system.

#### What happens when open closed principle is not followed:

- If a class always allows new addition of logic, we end up testing the entire functionality.
- The scope of changes are forwarded to the quality assurance team for regression testing.
- Costly Process to adapt
- It ends up breaking the single responsibility principle as well, as class or a function ends up doing multiple tasks.


#### Benefits of adhering to the Open-Closed Principle
- It covers how software entities can be changed by extension.
- It can potentially streamline code maintenance.
- Minimize the risk of breaking the existing code base.
- Only new changes will have to be deployed.
- If changes no longer serve user needs, they can be reverted.