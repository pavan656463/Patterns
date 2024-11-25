# Decorator Pattern Example in Java

This example demonstrates the use of the Decorator pattern in Java to add additional functionalities to objects dynamically at runtime.

## Overview

The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. It's a structural design pattern that promotes code reuse and is often used to extend the functionality of legacy systems.

In this example, we'll implement a simple data source system where data can be read from and written to a file. We'll use the Decorator pattern to add additional functionalities such as compression and encryption to the core data source object.

## Class Diagram

```plaintext
                       +------------------+
                       |    DataSource    |
                       +------------------+
                               / \
                               ---
                                |
                   +------------|-------------+
                   |            |             |
           +-------------------+     +-------------------+
           | FileDataSource    |     | DataSourceDecorator|
           +-------------------+     +-------------------+
                                      / \
                                      ---       
                                       |
                        +--------------|-------------------+
                        |              |                   |
          +-----------------------------+      +-----------------------------+
          | CompressionDecorator         |      | EncryptionDecorator         |
          +-----------------------------+      +-----------------------------+
```

## Classes

### `DataSource` Interface
Represents the component interface with methods for reading and writing data.

### `FileDataSource` Class
Concrete component implementing the `DataSource` interface. It provides the core functionality of reading and writing data to a file.

### `DataSourceDecorator` Class
Abstract decorator class implementing the `DataSource` interface. It maintains a reference to the wrapped component and provides a common interface for concrete decorators.

### `CompressionDecorator` Class
Concrete decorator adding compression functionality to the data source by extending the `DataSourceDecorator` class.

### `EncryptionDecorator` Class
Concrete decorator adding encryption functionality to the data source by extending the `DataSourceDecorator` class.

## Usage

In the `Main` class, we create a `FileDataSource` object and then wrap it with one or more decorators (`CompressionDecorator` and `EncryptionDecorator`). These decorators add compression and encryption functionalities to the core `FileDataSource` object.


```java
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\pavan.k\\Desktop\\encrypted_data.txt";
        DataSource source = new FileDataSource(filePath);
        source = new CompressionDecorator(source);
        source = new EncryptionDecorator(source);

        source.writeData("Hello, World!");

        String data = source.readData();
        System.out.println("Data: " + data);
    }
}

```

<h1>Benefits</h1>
Allows the addition of new functionalities to objects dynamically at runtime.
Promotes code reuse by allowing decorators to be stacked or combined in various ways.
Ensures open/closed principle by allowing classes to be easily extended with new functionality without modifying their structure.