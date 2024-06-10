# Strategy Design Pattern

## What is the Strategy Design Pattern?

The Strategy design pattern is a behavioral design pattern that allows an object, called the context, to vary its behavior at runtime by selecting from multiple algorithms encapsulated in separate classes, known as strategies. This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy pattern enables the algorithm to be selected at runtime without modifying the context that uses the algorithm.

## When to Use the Strategy Design Pattern?

Use the Strategy pattern when:

- You have a class that needs to perform a behavior that may vary.
- You want to define a family of algorithms, encapsulate each one, and make them interchangeable.
- You have multiple related classes that differ only in their behavior.
- You want to isolate the implementation details of an algorithm from the code that uses it, allowing for easier modification and maintenance.

## Components of the Strategy Design Pattern

1. **Context**: This is the class that contains a reference to a Strategy object and uses it to execute a particular algorithm. The context allows clients to dynamically change the strategy being used.

2. **Strategy Interface/Abstract Class**: This defines a common interface or abstract class for all supported algorithms. It usually contains one or more methods that represent the algorithm's signature.

3. **Concrete Strategies**: These are the concrete implementations of the Strategy interface. Each concrete strategy encapsulates a specific algorithm.


## Benefits of Using the Strategy Design Pattern
- Promotes code reuse and modularity by separating algorithms from the context.
- Enables dynamic selection of algorithms at runtime.
- Makes it easy to add new algorithms without modifying existing code.

## Drawbacks of Using the Strategy Design Pattern
- Increases the number of classes in the codebase, which may lead to complexity if not managed properly.
- Requires clients to be aware of different strategies and to choose the appropriate one.

## Conclusion
The Strategy design pattern provides a flexible and elegant solution for implementing algorithms that can vary independently of the context in which they are used. By encapsulating algorithms in separate classes and allowing them to be swapped at runtime, the Strategy pattern promotes code reuse, modularity, and maintainability.

## Example

Suppose you have a sorting algorithm that you want to switch dynamically between different strategies like Bubble Sort, Quick Sort, and Merge Sort. You can implement the Strategy pattern as follows:

```python
# Strategy interface
class SortStrategy:
    def sort(self, data):
        pass

# Concrete strategy classes
class BubbleSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Bubble Sort
        return sorted(data)

class QuickSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Quick Sort
        return sorted(data)

class MergeSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Merge Sort
        return sorted(data)

# Context
class Sorter:
    def __init__(self, strategy):
        self.strategy = strategy

    def set_strategy(self, strategy):
        self.strategy = strategy

    def sort_data(self, data):
        return self.strategy.sort(data)

# Usage
data = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
sorter = Sorter(BubbleSortStrategy())
print(sorter.sort_data(data))

sorter.set_strategy(QuickSortStrategy())
print(sorter.sort_data(data))

sorter.set_strategy(MergeSortStrategy())
print(sorter.sort_data(data))
