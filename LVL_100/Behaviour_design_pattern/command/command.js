// Receiver
class Coach {
    shoot() {
        console.log("Coach instructs: Shoot the ball!");
    }

    pass() {
        console.log("Coach instructs: Pass the ball!");
    }

    defend() {
        console.log("Coach instructs: Defend the goal!");
    }
}

// Command interface
class Command {
    constructor(receiver) {
        this.receiver = receiver;
    }

    execute() {
        throw new Error("execute() method must be implemented");
    }
}

// Concrete Commands
class ShootCommand extends Command {
    execute() {
        this.receiver.shoot();
    }
}

class PassCommand extends Command {
    execute() {
        this.receiver.pass();
    }
}

class DefendCommand extends Command {
    execute() {
        this.receiver.defend();
    }
}

// Invoker
class Player {
    constructor() {
        this.command = null;
    }

    setCommand(command) {
        this.command = command;
    }

    executeCommand() {
        this.command.execute();
    }
}

// Example Usage
const coach = new Coach();
const player = new Player();

const shootCommand = new ShootCommand(coach);
const passCommand = new PassCommand(coach);
const defendCommand = new DefendCommand(coach);

// Assign commands to player
player.setCommand(shootCommand);
player.executeCommand(); // Output: Coach instructs: Shoot the ball!

player.setCommand(passCommand);
player.executeCommand(); // Output: Coach instructs: Pass the ball!

player.setCommand(defendCommand);
player.executeCommand(); // Output: Coach instructs: Defend the goal!
