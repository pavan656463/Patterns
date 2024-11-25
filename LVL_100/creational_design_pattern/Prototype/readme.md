# Object Inheritance Prototype

## Overview

This prototype demonstrates object inheritance in JavaScript using the prototype chain.

## Introduction

JavaScript supports object-oriented programming (OOP) paradigms, including inheritance. Object inheritance allows objects to inherit properties and methods from other objects, forming a prototype chain.

## Features

- **Creating Objects**: Define objects using object literals and add properties and methods directly.
- **Prototype Chain**: Objects can inherit properties and methods from other objects through the prototype chain.
- **Setting Prototypes**: Use the `__proto__` property to set the prototype of an object to another object.

## Getting Started

1. Clone this repository to your local machine.
2. Open the `index.html` file in a web browser.

## Usage

1. **Creating Objects**:
    ```javascript
    let person = {
        name: "Pavan",
        age: 21,
        isMarried: false
    };
    ```

2. **Defining Prototype**:
    ```javascript
    let p = {
        run: () => {
            console.log("Hello");
        }
    };
    ```

3. **Setting Prototype**:
    ```javascript
    person.__proto__ = p;
    ```

4. **Accessing Inherited Method**:
    ```javascript
    person.run(); // Outputs: "Hello"
    ```

## Contributing

Contributions are welcome! If you'd like to enhance this prototype, please fork the repository and create a pull request.


