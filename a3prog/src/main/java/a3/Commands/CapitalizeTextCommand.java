package a3.Commands;

import a3.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    public CapitalizeTextCommand() {
        
    }

    @Override
    public String execute(String text) {
        if ((text == null) || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
    
}