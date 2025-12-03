package _17_OOPS._05_Abstraction._05_Functional_Interface;

public class FunctionalInterfaceLearning {
    public static void main(String[] args) {
        NewClass obj = new NewClass();              // 5
        obj.interfaceMethod();                      // 6
    }
}

@FunctionalInterface                                // 7
interface SuperInterface{                           // 1
    void interfaceMethod();                         // 2
}

class NewClass implements SuperInterface{           // 3
    @Override
    public void interfaceMethod() {                 // 4
        System.out.println("This is functional interface");
    }
}

/*
    1. Created a Functional Interface (As it only has a single method in it)
    2. Passed a single method in it
    3. Implements Interface SuperInterface in classNewClass
    4. Override methods interfaceMethod() and Passed a value to interfaceMethod()
    5. created an oobject of the class
    6. called a method
    7. Annotation
*/