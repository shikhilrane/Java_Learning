package _17_OOPS._03_Inheritance._03_Method_Overriding;

// child class of class B

public class C extends B{
    public static void main(String[] args) {
        C thirdClass = new C();
        thirdClass.move();              
    }
}

/*
    class C is child class of class B
    here we haven't made move(); method for class C so it will executes its parent's class (i.e. class B) move method.
    if in case move(); is not present in its parent's class (i.e. in class B) then in that case it will execute move(); method from class A
*/