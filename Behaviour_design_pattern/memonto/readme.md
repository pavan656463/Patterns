Memento Pattern
===============

The Memento pattern is a behavioral design pattern that allows an object to capture and externalize its internal state, so that it can be restored later.

**Problem**

When you need to implement features like undo/redo, or when you want to save the state of an object and restore it later.

**Solution**

The Memento pattern provides a way to externalize the internal state of an object, so that it can be restored later. This is achieved by creating a separate object, called a Memento, that holds the state of the original object.

**Example**

In this example, we have a `Maze` class that represents a maze game. The `Maze` class has a `playerPosition` property that stores the current position of the player. We want to be able to save the current state of the maze and restore it later.

We create a `MazeMemento` class that holds the state of the `Maze` class. The `MazeMemento