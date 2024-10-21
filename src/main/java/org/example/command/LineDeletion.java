package org.example.command;

import java.security.PublicKey;

public class LineDeletion implements Command {
    private Document target;
    private int atLine;
    private String removed;

    public LineDeletion(Document target, int atLine) {
        this.target = target;
        this.atLine = atLine;
    }

    @Override
    public void execute() {
        removed = target.getLine(atLine);
        target.remove(atLine);
    }

    @Override
    public void undo() {
        target.putLine(removed, atLine);
    }
}
