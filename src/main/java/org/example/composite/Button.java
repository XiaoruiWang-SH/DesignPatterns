package org.example.composite;

public class Button extends Component{
    @Override
    public void resize() {
        System.out.println("resize button");
    }

    @Override
    public void draw() {
        System.out.println("draw button");
    }
}
