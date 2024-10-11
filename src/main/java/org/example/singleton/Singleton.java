package org.example.singleton;

/**
 * keyword final: in case users will inherit this class
 */

final public class Singleton {
    public static volatile Singleton instance = null;

    /* make constructor is private make sure anyone can not instantiate it explicitly */
    private Singleton(){}

    /* the only entry method users can get the instance */
    public static Singleton instance() {
        if (instance == null) { /* lazy creation */
            synchronized (Singleton.class){ /* make sure only one thread visited this code section */
                if (instance == null) { /* double check*/
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printMe() {
        System.out.println("I am a singleton");
    }
}

// public enum Singleton {
//    INSTANCE(0);
//
//    private int age = 0;
//    private Singleton(int age){
//        this.age = age;
//    }
//
//    public int age(){
//        return age;
//    }
//
//    public void printMe() {
//        System.out.println("I am a singleton");
//    }
//
//
//}


