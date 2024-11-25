# Decorator Pattern Examples in Python

## Introduction
The Decorator pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects of the same class. In Python, decorators are functions that take another function as an argument and extend its behavior without explicitly modifying it.

## Coffee Order System

This Python program demonstrates the use of the Decorator design pattern to create a coffee order system where customers can add milk and sugar to their coffee.

### Implementation

The program consists of the following classes:

- `Coffee`: This is the interface defining the methods that concrete coffee classes should implement.
- `SimpleCoffee`: This is a concrete coffee class implementing the `Coffee` interface. It represents a basic coffee order.
- `CoffeeDecorator`: This is an abstract class representing the decorator. It extends the `Coffee` interface and contains a reference to a `Coffee` object.
- `Milk` and `Sugar`: These are concrete decorator classes that add milk and sugar to the coffee, respectively.

### Usage

1. Create a `SimpleCoffee` object to represent a basic coffee order.
2. Use `Milk` and `Sugar` decorators to add milk and sugar to the coffee, respectively.
3. Calculate the total cost of the coffee order by calling the `cost()` method on the final decorated coffee object.

# Government Price Index System

This Python program demonstrates the use of the Decorator design pattern to implement a government price index system. In this system, we calculate the minimum and maximum selling price indexes (MSP and MaxSP) based on a base price index.

## Introduction

The Decorator pattern is a structural design pattern that allows behavior to be added to individual objects dynamically, without affecting the behavior of other objects of the same class. It's a powerful pattern for extending the functionality of objects in a flexible and reusable way.

## Implementation

The program consists of the following classes:

- `PriceIndex`: This is the interface defining the methods that concrete price index classes should implement.
- `BasePriceIndex`: This is a concrete price index class implementing the `PriceIndex` interface. It represents the base price index.
- `PriceIndexDecorator`: This is an abstract class representing the decorator. It extends the `PriceIndex` interface and contains a reference to a `PriceIndex` object.
- `MSP` and `MaxSP`: These are concrete decorator classes that calculate the minimum and maximum selling price indexes, respectively, based on the base price index.

## Usage

1. Create a `BasePriceIndex` object to represent the base price index.
2. Use `MSP` and `MaxSP` decorators to calculate the minimum and maximum selling price indexes, respectively, based on the base price index.
3. Call the `calculate()` method on each price index object to get the calculated values.

## Example

```python


coffee = SimpleCoffee()
print("Cost of simple coffee:", coffee.cost())

coffee_with_milk = Milk(coffee)
print("Cost of coffee with milk:", coffee_with_milk.cost())

coffee_with_milk_and_sugar = Sugar(coffee_with_milk)
print("Cost of coffee with milk and sugar:", coffee_with_milk_and_sugar.cost())
