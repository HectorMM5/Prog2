package a3.Commands;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

    public CapitalizeWordsTextCommand() {
        
    }

    @Override
    public String execute(String text) {
        if ((text == null) || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        String[] words = text.split(" ");

        String fullText = "";

        for (String word : words) {
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);

            fullText += capitalizedWord;
        }        


        return fullText;
    }
    
}