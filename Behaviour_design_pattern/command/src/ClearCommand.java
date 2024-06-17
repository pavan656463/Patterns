package Behaviour_design_pattern.command.src;

// ClearCommand.java
public class ClearCommand implements Command {
    private TextEditor textEditor;
    private String backup;

    public ClearCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        backup = textEditor.getText();
        textEditor.clear();
    }

    @Override
    public void undo() {
        textEditor.restore(backup);
    }
}
