# Food Chain Example: Frog, Eagle, and Snake

This is a JavaScript example illustrating the Composite design pattern with a food chain scenario involving frogs, eagles, and snakes. Each organism represents a node in the food chain, with predators hunting and eating their prey.

## Overview

The Composite design pattern is utilized to represent the hierarchical relationships in the food chain, allowing for a unified approach in handling individual organisms and groups of organisms.

### Components

- **Organism**: Base class or interface representing both predators and prey, providing the common `eat()` method.
- **Prey**: Leaf class representing organisms that are consumed by predators.
- **Predator**: Composite class representing organisms that hunt and consume other organisms. It maintains a list of prey.

## Usage

1. Instantiate prey objects (e.g., fly).
2. Instantiate predator objects (e.g., frog, snake, eagle).
3. Add prey objects to the predator's prey list using the `addPrey()` method.
4. Invoke the `eat()` method on predator objects to simulate hunting and feeding.

## Example

```javascript
// Example code snippet
// See full example code in the provided JavaScript file.

// Instantiate prey and predator objects
const fly = new Prey('Fly');
const frog = new Predator('Frog');
const snake = new Predator('Snake');
const eagle = new Predator('Eagle');

// Build the food chain hierarchy
frog.addPrey(fly);
snake.addPrey(frog);
eagle.addPrey(snake);

// Simulate hunting and feeding
eagle.eat(); // Eagle is hunting... Snake is hunting... Frog is hunting... Fly is eaten
