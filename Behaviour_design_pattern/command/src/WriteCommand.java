package Behaviour_design_pattern.command.src;

// WriteCommand.java
public class WriteCommand implements Command {
    private TextEditor textEditor;
    private String text;

    public WriteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.write(text);
    }

    @Override
    public void undo() {
        textEditor.undoWrite(text);
    }
}


