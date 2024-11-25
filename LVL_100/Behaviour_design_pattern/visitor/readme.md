Visitor Pattern
==============

The Visitor pattern is a behavioral design pattern that allows you to add new operations to a class hierarchy without changing the classes themselves. It's useful when you need to perform operations on a complex object structure and you want to avoid coupling the operations to the classes that define the structure.

**Problem**

When you need to perform operations on a complex object structure, but you don't want to couple the operations to the classes that define the structure.

**Solution**

The Visitor pattern provides a way to separate the operations from the classes that define the structure. This is achieved by creating a separate object, called a Visitor, that defines the operations. The classes that define the structure then implement a method that accepts a Visitor object and calls the appropriate method on the Visitor.

**Example**

In this example, we have a `Shape` class hierarchy that represents different shapes. We want to be able to calculate the area and perimeter of each shape, but we don't want to couple the calculation logic to the `Shape` classes.

We create a `ShapeVisitor` interface that defines the `visit_circle`, `visit_square`, and `visit_triangle` methods. We then create two concrete Visitor classes: `AreaVisitor` and `AreaPerimeterVisitor`. The `AreaVisitor` class calculates the area of each shape, while the `AreaPerimeterVisitor` class calculates both the area and perimeter of each shape.

The `Shape` classes implement the `accept` method, which accepts a Visitor object and calls the appropriate method on the Visitor.

**Pros**

* Allows you to add new operations to a class hierarchy without changing the classes themselves.
* Separates the operations from the classes that define the structure.
* Makes it easy to add new operations to the structure.

**Cons**

* Can lead to a large number of Visitor classes if you need to perform many different operations on the structure.
* Can make the code harder to understand if the Visitor classes are not well-designed.
* Can lead to a large number of methods in the interface if you need to perform many different operations on the structure.