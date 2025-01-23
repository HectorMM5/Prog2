package a3.Commands;

import a3.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    public CapitalizeTextCommand() {
        
    }

    @Override
    public String execute(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
    
}