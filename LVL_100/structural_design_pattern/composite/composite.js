// Component interface
class Organism {
    constructor(name) {
        this.name = name;
    }

    eat() {
        throw new Error('eat() method must be implemented');
    }
}

// Leaf class
class Prey extends Organism {
    eat() {
        console.log(`${this.name} is eaten`);
    }
}

// Composite class
class Predator extends Organism {
    constructor(name) {
        super(name);
        this.preyList = [];
    }

    addPrey(prey) {
        this.preyList.push(prey);
    }

    eat() {
        console.log(`${this.name} is hunting...`);
        this.preyList.forEach(prey => prey.eat());
    }
}

// Usage
const fly = new Prey('Fly');
const frog = new Predator('Frog');
const snake = new Predator('Snake');
const eagle = new Predator('Eagle');

frog.addPrey(fly);
snake.addPrey(frog);
eagle.addPrey(snake);

eagle.eat(); // Eagle is hunting... Snake is hunting... Frog is hunting... Fly is eaten
