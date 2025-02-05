package a3;

import java.util.ArrayList;
import java.util.List;

public class Script {
    private final List<TextCommand> commands;

    public Script() {
        this.commands = new ArrayList<>();
    }

    // Method to add a command to the pipeline
    public void addCommand(TextCommand command) {
        commands.add(command);
    }

    // Method to execute all commands in order on the given text
    public String execute(String text) {
        for (TextCommand command : commands) {
            text = command.execute(text);
        }
        return text;
    }
}
