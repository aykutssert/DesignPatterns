## What is Adapter Design Pattern?

Adapter design pattern is a structural pattern that transforms the interface of an existing class into another interface that the client expects. This pattern allows incompatible classes to work together. The adapter pattern aims to create a new interface compatible with an existing class without changing it.

### Adapter Pattern Usage Areas

- Integrating old systems with new systems: Instead of rewriting your old codes or systems, you can make them compatible with existing systems.
- Using third-party libraries: If the interface of a third-party library is not compatible with the interface the client expects, you can make the interfaces compatible by using adapters.
- Combining multiple class hierarchies: Can be used to bring together different class hierarchies and provide access through a common interface.

### Basic Components of the Adapter Pattern

- Target: The interface the client wants to use.
- Client: The class that uses the target interface.
- Adaptee: The existing class to adapt to.
- Adapter: Class that converts Adaptee's interface to the Target interface.

#### Types of Adapter Pattern

- Class Adapter: - It is carried out through inheritance.
  The Adapter class extends both the Target interface and the Adaptee.
  Since there is no multiple inheritance in Java, interface can be implemented by inheritance.

- Object Adapter: - It is achieved through composition.
  The Adapter class has an Adaptee object and implements the Target interface using it.
  It is more flexible and more widely used in Java.
