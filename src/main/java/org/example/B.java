package org.example;

public class B extends A{
    String getName() { return " I ’m B " ; }

    void printSomething(A aParam) {
        System.out.println( " A at B : " + aParam.getName() );
    }
    void printSomething(B bParam) {
        System.out.println( " B at B : " + bParam.getName() );
    }
}
