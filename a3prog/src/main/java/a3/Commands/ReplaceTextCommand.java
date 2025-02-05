package a3.Commands;

public class ReplaceTextCommand implements a3.TextCommand {

    String target;
    String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public String getReplacement() {
        return replacement;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public String execute(String text) {
        if ((text == null) || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid string");
        }

        return text.replace(target, replacement);

    }

}