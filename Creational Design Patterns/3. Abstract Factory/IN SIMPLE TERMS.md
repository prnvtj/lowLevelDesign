1. Create interfaces that are expected to work together
2. Create concrete implementations of the interfaces that are functional
3. Create a single interface that integrates all the interfaces into one - this will have the return type as interfaces that work together in its methods separately (Abstract factory)
4. Create concrete factories that will implement the abstract interface. this will return the objects based on the type of output we need.
5. Create another class where this will create the object based on the input given in the client code. This will have the input parameters as the factory and any input that will distinguish the concrete implementation of the abstract factory
6. The client code only calls the last created class with the abstract factory and a parameter that distinguishes the concrete implementation of the abstract class