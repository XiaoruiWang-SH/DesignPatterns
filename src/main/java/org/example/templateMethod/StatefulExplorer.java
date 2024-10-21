package org.example.templateMethod;

public class StatefulExplorer extends Explorer {
    public StatefulExplorer(Maze maze, Room position) {
        super(maze, position);
    }

    @Override
    public void inspect() {
        System.out.println("Not find");
    }

    @Override
    public Room next() {
        return null;
    }
}
