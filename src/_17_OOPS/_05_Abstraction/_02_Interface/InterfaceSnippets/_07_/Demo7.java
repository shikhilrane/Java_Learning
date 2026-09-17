package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._07_;

public class Demo7 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

// Java Resolution priority rule

interface A {
    default void fun() {
        System.out.println("Inside A interface");
    }
}

class B {
    public void fun() {
        System.out.println("Inside B class");
    }
}

class C extends B implements A {
    @Override
    public void fun() {
        A.super.fun();  // Calls the default method from interface A
        super.fun();    // Calls the method from class B
        System.out.println("Inside C class");
    }
}

/*
    Java Method Resolution Priority Rule:
        1. Interface A provides a default method fun().
        2. Class B provides a normal method fun().
        3. Class C extends B and implements A.
        4. If both class and interface have the same method, the class method gets higher priority.
        5. Here, C also overrides fun(), so C's method has the highest priority.
        6. Method resolution order is : Child Class > Parent Class > Interface Default Method

    Execution:
        1. Create object of C.
        2. Call c.fun().
        3. JVM executes C's overridden fun() method.
        4. Output: Inside C class
*/