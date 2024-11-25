# Flyweight Pattern

The Flyweight pattern is a structural design pattern that aims to minimize memory usage and improve performance by sharing as much data as possible with other similar objects. It's particularly useful when dealing with a large number of objects that have some shared characteristics.

In this example, we'll implement a simple book distributor system using the Flyweight pattern.

## Example: Book Distributor System

### Overview

The program simulates a book distributor system where books are distributed based on orders. The Flyweight pattern is used to efficiently manage the creation and sharing of book objects.

### Classes

1. **Book**: Represents a book object with attributes like title, author, and genre. It also has a method to display the book details.

2. **BookCatalog**: Acts as a flyweight factory. It manages the creation and retrieval of book objects. If a book with a specific title, author, and genre already exists, it returns that existing book; otherwise, it creates a new one.

3. **BookDistributor**: Responsible for distributing books. It uses the `BookCatalog` to obtain book objects based on orders and then displays the details of each book.

### Usage

To run the program:


