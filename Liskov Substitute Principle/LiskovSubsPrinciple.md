<h1>Liskov Substitution Principle<br>



<h3> Formal Defination by Zaiba:

* The Liskov Substitution principle was introduced by Barbara Liskov in her conference keynote “Data abstraction” in 1987.
* It extends the open/closed Principle by focusing on the behavior of a superclass and its subtypes.
* In a practical Software development environment:
  - The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
  - That requires the objects of your subclasses to behave in the same way as the objects of your superclass. You can achieve that by following a few rules, which are pretty similar to the design by contract concept defined by   Bertrand Meyer.
  - An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass.
  - Let $(x) be a property provable about objects x of type T. Then $(y) should be true for objects y of type S where S is a subtype of T.
___
<h3> Example by Nomaan:

<details>
<summary>Car</summary>

```c++
class Car
{
	public:
		void drive();
		void seatBelt();
		void airBag();
		void shiftGear();
		void fuelIndicator();
}
class Ford: public Car
{
	/*
	Can use Drive function
	Can use fuelIndicator
	.....
	*/
}
class Toyota: public Car
{
	/*
	Can use Drive function
	Can use fuelIndicator
	....
	*/
}
```
Ford and Toyota can completely replace any instance of Car, hence LSP is obeyed here.
</details>
<details>
<summary>New Car</summary>

```c++
class Car
{
	public:
		void drive();
		void seatBelt();
		void airBag();
		void shiftGear();
		void fuelIndicator();
}
class Ford: public Car{}
class Toyota: public Car{}
class Tesla: public Car
{
	void shiftGear()
	{
		/*
			Set a message? Do nothing? Nope
			It may be used to update some private members
			Can be used differently for this sub type
		*/
	}
}
```
* In this case we can either divide the class Car:
   - Gas Car
   - Electric Car<br>
   Where each sub type can make use of its own functions and have common ones in class Car
</details>

___

<h3>Importance of Liskov Substitution Principle by Sujeet

* In simple words the Liskov Substitution Principle states that substituting an object of a subclass should not change the behavior, or the correctness, of the program.
* Liskov Substitution Principle ecourages code reusability.
* A code that does not adhere to the Liskov Substitution Principle increases its complexity.
* The disadvantage of writing code that does not adhere to LSP is that when a subclass can not substitute its parent class there would have to be multiple conditional statements to determine the class or type to handle certain cases differently.
* If there are changes that are required then these changes would have to be applied in multiple places.
