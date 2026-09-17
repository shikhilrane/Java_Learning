package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._03_;

public class Demo3 {
    public static void main(String[] args) {

    }
}

// Multiple Inheritance --> Interfaces

interface A {
    void fun();
}

interface B {
    void fun2();
}

class C implements A, B {
    @Override
    public void fun() {

    }

    @Override
    public void fun2() {

    }
}

/*
    Multiple Inheritance using Interfaces:
        1. A class can implement multiple interfaces.
        2. Interface A provides fun().
        3. Interface B provides fun2().
        4. Class C implements both A and B.
        5. So C must override all abstract methods of both interfaces.
        6. This is called Multiple Inheritance through Interfaces.
        7. Java does not support multiple inheritance of classes, but it supports multiple inheritance of interfaces.

    Execution:
        1. Class C implements interfaces A and B.
        2. Override fun() from A.
        3. Override fun2() from B.
        4. Class C now has features of both interfaces.
*/