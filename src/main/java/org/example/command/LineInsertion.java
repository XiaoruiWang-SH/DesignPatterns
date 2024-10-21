package org.example.command;

public class LineInsertion implements Command{

    private Document target;
    private int atLine;
    private String inserted;

    public LineInsertion(Document target, int atLine, String inserted) {
        this.target = target;
        this.atLine = atLine;
        this.inserted = inserted;
    }

    @Override
    public void execute() {
        target.putLine(inserted, atLine);
    }

    @Override
    public void undo() {
        target.remove(atLine);
    }
}
