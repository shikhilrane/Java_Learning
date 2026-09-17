package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._06_;

public class Demo6 {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}

// Diamond problem solved by interfaces

interface A {
    void fun();
}

interface B extends A {
    default void fun() {
        System.out.println("B");
    }
}

interface C extends A {
    default void fun() {
        System.out.println("C");
    }
}

class D implements B, C {
    @Override
    public void fun() {
        B.super.fun();
        C.super.fun();
        System.out.println("D");
    }
}

/*
    Diamond Problem in Interfaces:
        1. Interface B and C both extend interface A.
        2. Both B and C provide their own default implementation of fun().
        3. Class D implements both B and C.
        4. Now JVM gets confused about which fun() method should be used.
        5. This is called the Diamond Problem.
        6. Java solves this by forcing class D to override fun().
        7. After overriding, D's implementation is executed.

    Execution:
        1. Create object of D.
        2. Call d.fun().
        3. JVM executes D's overridden fun() method.
        4. Output: D
*/