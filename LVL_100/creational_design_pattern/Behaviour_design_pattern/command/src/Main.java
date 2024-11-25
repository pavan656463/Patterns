package Behaviour_design_pattern.command.src;

// Main.java
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Editor editor = new Editor();

        Command writeCommand1 = new WriteCommand(textEditor, "Pavan");
        Command writeCommand2 = new WriteCommand(textEditor, "Kumar");
        Command clearCommand = new ClearCommand(textEditor);

        editor.executeCommand(writeCommand1);
        editor.executeCommand(writeCommand2);

        System.out.println("Text after writing: " + textEditor.getText());

        editor.undoLastCommand();
        System.out.println("Text after undoing last command: " + textEditor.getText());

        editor.executeCommand(clearCommand);
        System.out.println("Text after clearing: " + textEditor.getText());

        editor.undoLastCommand();
        System.out.println("Text after undoing clear: " + textEditor.getText());
    }
}

