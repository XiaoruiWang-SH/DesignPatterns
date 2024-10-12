package org.example.composite;

public class Textfield extends Component{
    @Override
    public void resize() {
        System.out.println("resize textfield");
    }

    @Override
    public void draw() {
        System.out.println("draw textfield");
    }
}
