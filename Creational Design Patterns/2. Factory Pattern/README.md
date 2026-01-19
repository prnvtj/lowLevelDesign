
Motivation:
Consider an example of transportation service app where users can request different types of transport vehicles (e.g., Car, Bike, Bus). You might initially create separate classes for each type and create instances like this:

Car car = new Car();
Bike bike = new Bike();

But as the system evolves, managing object creation directly like this can become complex, especially when adding new types of vehicles.

Problems:
	1. The client code (Main class )is tightly coupled to concrete classes(Car, Bike, Bus)
	2. Adding a new transport types required modifying client code  //violates open/close principle

The Factory Pattern helps centralize the creation logic and delegates the responsibility of creating objects to factory classes, which decide the specific class to instantiate. This allows the code to adhere to the Open/Closed Principle by letting new types of vehicles to be added without modifying the existing code

	1. Factory Class: The TransportFactory class contains the logic to create different types of transport based on the input string. This abstracts the creation logic and makes it easier to add or change transport types.
	2. Decoupling: The TransportService class (client) no longer needs to know the details of how Car, Bike or Bus are created. It simply calls the factory method.
	3. Flexibility: Adding a new transport type (e.g., Truck) only requires modifying the factory, not the client code.

Real World Use Cases:
	• GUI Frameworks: When the type of button or widget to be created is determined at runtime based on the platform (e.g., Windows, macOS, Linux)
	• Database Connectivity: When choosing different types of databases (e.g., SQL. NoSQL) based on configuration.
	• Document Conversion Tools: Where the type of file (e.g., PDF, Word, HTML) to be created depends on the user input or settings.

the Factory Design Pattern is a fundamental tool to reduce coupling and centralize object creation logic, especially in systems that need to support multiple types of objects.

If we need to implement something which is conditional, then we need to use Factory design pattern. This could be done by writing conditional statements, but in order to avoid duplicity, we use a design pattern to implement

Abstract Factory Pattern:
	1. Factory of factory.
	2. if there are a lot of products such that there are groups internally within a type of product, then we can use abstract factory pattern


### **When Should You Use It?**

We can use the Factory Pattern when:
* The client code needs to work with multiple types of objects.
* The decision of which class to instantiate must be made at runtime.
* The instantiation process is complex or needs to be controlled.

### **Basic Structure of Factory Pattern**

The Factory Pattern typically consists of the following components:

1. Product: It is an interface or abstract class that defines the methods the product must implement.
2. Concrete Products: The concrete classes that implement the Product interface.
3. Factory: A class with a method that returns different concrete products based on input.