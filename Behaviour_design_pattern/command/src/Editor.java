package Behaviour_design_pattern.command.src;

// Editor.java
import java.util.Stack;

public class Editor {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}

