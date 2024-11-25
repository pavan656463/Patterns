# Command Design Pattern

The Command Design Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. It promotes loose coupling between the sender and receiver of a request.

## Structure

- **Command**: This is an interface or abstract class defining the command's execute method, which encapsulates a request as an object. Concrete Command classes implement this interface and hold the necessary information to execute the request.

- **Invoker**: This is responsible for invoking commands. It holds a reference to a command object and triggers its execution through the execute method.

- **Receiver**: This knows how to perform the operations associated with carrying out a request. It can be any object with a defined action.

- **Client**: This creates concrete command objects and associates them with specific receivers. It then passes these command objects to invokers to execute the requested operations.

## Example

Consider a simple scenario of a remote control interacting with various electronic devices. We have a Remote Control (Invoker) that can be associated with different Commands, such as turning on the TV, changing the channel, or adjusting the volume. Each Command is associated with a specific Receiver (e.g., TV or Stereo) that knows how to carry out the command.

## When to Use
- Use the Command pattern when you want to parameterize objects with operations.
- Use it to queue requests, undo/redo functionality, or log command history.
- Use it when you need to decouple the sender and receiver of a request.

## Benefits
- Decouples the sender from the receiver.
- Allows you to parameterize objects with operations.
- Enables command queueing, undo/redo functionality, and logging.

## Drawbacks
- Can introduce a large number of command classes.
- Overhead of implementing the pattern may not be justified for simple scenarios.

## Related Patterns
- **Observer Pattern**: Commands can use the Observer pattern to notify interested objects of state changes.
- **Memento Pattern**: Commands can use the Memento pattern to capture the state of an object for undo/redo functionality.


## Implementation

Here's a basic example of implementing the Command Design Pattern in JavaScript:

```javascript
// Receiver
class Light {
    turnOn() {
        console.log("Light is on");
    }

    turnOff() {
        console.log("Light is off");
    }
}

// Command interface
class Command {
    execute() {
        throw new Error("execute() method must be implemented");
    }
}

// Concrete Commands
class TurnOnCommand extends Command {
    constructor(light) {
        super();
        this.light = light;
    }

    execute() {
        this.light.turnOn();
    }
}

class TurnOffCommand extends Command {
    constructor(light) {
        super();
        this.light = light;
    }

    execute() {
        this.light.turnOff();
    }
}

// Invoker
class RemoteControl {
    constructor() {
        this.command = null;
    }

    setCommand(command) {
        this.command = command;
    }

    pressButton() {
        this.command.execute();
    }
}

// Example Usage
const light = new Light();
const turnOnCommand = new TurnOnCommand(light);
const turnOffCommand = new TurnOffCommand(light);

const remote = new RemoteControl();

remote.setCommand(turnOnCommand);
remote.pressButton(); // Output: Light is on

remote.setCommand(turnOffCommand);
remote.pressButton(); // Output: Light is off
