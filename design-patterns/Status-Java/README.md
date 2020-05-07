# State Design Pattern

This is a behavioural pattern as it defines a manner for controlling communication between classes or entities.

The state pattern is useful when creating object-oriented state machines, where the functionality of an object changes fundamentally according to its state. By using multiple concrete classes, each inheriting from the same base class, large differences in functionality are possible without resorting to numerous "if" or "switch" statements.

![UML of State Design pattern](State.png "UML class diagram of State Design Pattern")

## Java example



### Running the example

As you can see in the output there is a limitation on the access just ny knowing the designation of the employee by its name by `getRole` method. `grantInternetAccess` gives access to the employees of certain designation from the proxy class.

```{bash}
$output:
On vibration...
On vibration...
Choose state from choices
-------------------------

1 - Select Silent
2 - Select Vibration
3 - Select Switched off
4 - Select Flight
5 - Select Sleep
1
On silent...
2
On vibration...
3
On SwitchedOFff mode...
4
On Flight mode...
5
On Sleep mode...

```