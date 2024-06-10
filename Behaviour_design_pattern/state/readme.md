# State Design Pattern

The State design pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. It enables an object to change its behavior at runtime without changing its class. In other words, the object appears to change its class.

## When to Use

Use the State pattern when:

- An object's behavior depends on its state, and it must change its behavior dynamically depending on that state.
- Operations have large, multipart conditional statements that depend on the object's state.

## Key Components

- **Context**: This is the object whose behavior changes based on its internal state. It maintains a reference to the current state object.
- **State**: This is an interface or an abstract class that defines a set of methods for handling different states that the context object can be in.
- **Concrete States**: These are the concrete implementations of the State interface. Each concrete state represents a specific state of the context and provides implementations for the methods defined in the State interface.
- **Client**: This is the entity that uses the context object. It interacts with the context object, which in turn delegates its behavior to the current state object.

## Example

Consider a phone that can be in either a locked or unlocked state. Let's implement the State pattern for this scenario:

```javascript
// State interface
class State {
    constructor(phone) {
        this.phone = phone;
    }

    unlock() {
        throw new Error("unlock() must be implemented by concrete states");
    }

    lock() {
        throw new Error("lock() must be implemented by concrete states");
    }
}

// Concrete State classes
class LockedState extends State {
    unlock() {
        console.log("Phone unlocked");
        this.phone.setState(this.phone.unlockedState);
    }

    lock() {
        console.log("Phone already locked");
    }
}

class UnlockedState extends State {
    unlock() {
        console.log("Phone already unlocked");
    }

    lock() {
        console.log("Phone locked");
        this.phone.setState(this.phone.lockedState);
    }
}

// Context class
class Phone {
    constructor() {
        this.lockedState = new LockedState(this);
        this.unlockedState = new UnlockedState(this);
        this.currentState = this.lockedState;
    }

    setState(state) {
        this.currentState = state;
    }

    unlock() {
        this.currentState.unlock();
    }

    lock() {
        this.currentState.lock();
    }
}

// Client code
const myPhone = new Phone();
myPhone.unlock(); // Phone unlocked
myPhone.unlock(); // Phone already unlocked
myPhone.lock();   // Phone locked
myPhone.lock();   // Phone already locked
