package org.example.templateMethod;

public class RandomExplorer extends Explorer{
    public RandomExplorer(Maze maze, Room position) {
        super(maze, position);
    }

    @Override
    public void inspect() {
        System.out.println("not find");
    }

    @Override
    public Room next() {
        return null;
    }
}
