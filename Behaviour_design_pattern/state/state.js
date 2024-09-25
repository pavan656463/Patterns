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
