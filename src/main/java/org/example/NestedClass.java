package org.example;

public class NestedClass {
     int a = 1;

     class SubClass {
         int b = 0;

         void testAccess() {
             System.out.println(a);
         }
     }

     void testSubclass() {
         SubClass sc = new SubClass();
         sc.testAccess();
     }


     // an interface defined ahead is necessary
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    HelloWorld frenchGreeting = new HelloWorld() {
        String name = "tout le monde";
        public void greet() {
            greetSomeone("tout le monde");
        }
        public void greetSomeone(String someone) {
            name = someone;
            System.out.println("Salut " + name);
        }
    };
}
