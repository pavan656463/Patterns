package Behaviour_design_pattern.command.src;

// TextEditor.java
public class TextEditor {
    private StringBuilder currentText = new StringBuilder();

    public void write(String text) {
        currentText.append(text);
    }

    public void undoWrite(String text) {
        int start = currentText.length() - text.length();
        currentText.delete(start, currentText.length());
    }

    public void clear() {
        currentText = new StringBuilder();
    }

    public void restore(String text) {
        currentText = new StringBuilder(text);
    }

    public String getText() {
        return currentText.toString();
    }
}
