package org.example;

import org.example.abstractFactory.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        {
            GUIFactory factory = GUIFactory.factory(OSType.Windows);
            GUIButton btn = factory.newButton();
            btn.click();
        }

        {
            GUIFactory factory = GUIFactory.factory(OSType.OSX);
            GUIButton btn = factory.newButton();
            btn.click();
        }




        /*
        NestedClass nc = new NestedClass();
        NestedClass.SubClass ns = nc.new SubClass();
        ns.testAccess();
         */

        /*
        A a = new A();
        A b = new B();
       // Next lines output : A or B at A : I ’m A
        a.printSomething(a);
// Next lines output : A or B at A : I ’m B
        a.printSomething(b);
// Next lines output : A at B : I ’m A
        b.printSomething(a);
// Next lines output : B at B : I ’m B
        b.printSomething(b);
        // overriding dynamic binding
        // overloading static binding
         */




    }
}