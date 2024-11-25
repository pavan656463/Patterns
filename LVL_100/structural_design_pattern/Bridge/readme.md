# Bridge Design Pattern in JavaScript

This repository provides an example implementation of the Bridge Design Pattern in JavaScript. The Bridge pattern is a structural design pattern that decouples an abstraction from its implementation, allowing them to vary independently.

Abstraction means inside that user doesnt't need to know 
Implementatio means Takes Abstraction<br> 
Example using libraries in code 

## Structure

The implementation consists of the following classes:

- **Implementor:** Defines the interface for implementation classes.
- **ConcreteImplementorA, ConcreteImplementorB:** Concrete implementation classes that implement the `Implementor` interface.
- **Abstraction:** Defines the interface for the abstraction and maintains a reference to an `Implementor` object.
- **RefinedAbstraction:** A refined abstraction class that extends `Abstraction` and adds additional methods specific to its usage.

## Usage

1. **Install Dependencies:** No external dependencies required.

2. **Run the Example:**

