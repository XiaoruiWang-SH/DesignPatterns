package org.example;

public class A {
    String getName() { return " I ’m A " ; }

    void printSomething(A aParam ) {
        System.out.println( " B at A : " + aParam.getName() );
     }
}
