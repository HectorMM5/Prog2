package a3.Commands;

public class WrapTextCommand implements a3.TextCommand {

    String opening;
    String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;

    }

}