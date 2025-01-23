package a3.Commands;

public class WrapLinesTextCommand extends a3.Commands.WrapTextCommand {

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        String[] lines = text.split("\n");

        String finalText = "";

        for (String line : lines) {
            String wrappedLine = new WrapTextCommand(opening, end).execute(line) + "\n";

            finalText += wrappedLine;
        }

        return finalText;
    }
    
}