package a3.Commands;

public class WrapSelectionTextCommand extends a3.Commands.WrapTextCommand {
    
    String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        String wrappedSelection = new WrapTextCommand(opening, end).execute(selection);

        return new ReplaceTextCommand(selection, wrappedSelection).execute(text);
    }
    
}