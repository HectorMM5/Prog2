package a3.Commands;

public class ReplaceFirstTextCommand extends a3.Commands.ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        if ((text == null) || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return text.replaceFirst(target, replacement);
    }


}