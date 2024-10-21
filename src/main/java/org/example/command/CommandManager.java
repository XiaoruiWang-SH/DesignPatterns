package org.example.command;

import java.util.Stack;

public class CommandManager {
    Stack<Command> history = new Stack<>();

    public void execute(Command request) {
        history.push(request);
        request.execute();
    }

    public void undo() {
        if (!history.empty()) {
            Command last = history.pop();
            last.undo();
        }
    }
}
