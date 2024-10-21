package org.example.templateMethod;

public abstract class Explorer {
    protected Maze maze;
    protected Room position;

    public Explorer(Maze maze, Room position) {
        this.maze = maze;
        this.position = position;
    }

    public abstract void inspect();
    public abstract Room next();

    public void start() {
        System.out.println("Start search in maze");
    }

    public final void explore() {
        start();
        while (!maze.isExit(position)) {
            inspect();
            position = next();
        }
    }
}
