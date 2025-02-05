package a3.Commands;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

    String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
        
    }

    public String getSelection() {
        return selection;
    }

    @Override
    public String execute(String text) {

        if ((text == null) || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }


        String[] words = selection.split(" ");

        String capitalizedText = "";

        for (String word : words) {
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);

            capitalizedText = new ReplaceTextCommand(word, capitalizedWord).execute(text);
    
        }
        
        return capitalizedText;
    }
    
}