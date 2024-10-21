package org.example.command;

import java.util.ArrayList;

public class Document {
    private ArrayList<String> lines = new ArrayList<>();

    public String getLine(int index) {
        if (index >= lines.size()) return null;
        return lines.get(index);
    }

    public void putLine(String line, int index) {
        if (index >= lines.size()) lines.add(line);
        lines.add(index, line);
    }

    public void remove(int index) {
        if (index >= lines.size()) return;
        lines.remove(index);
    }
}
