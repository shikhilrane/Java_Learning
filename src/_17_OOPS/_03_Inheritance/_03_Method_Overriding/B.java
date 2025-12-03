package _17_OOPS._03_Inheritance._03_Method_Overriding;

// child class of class A and parent class of class C

public class B extends A {
    void move(){
        System.out.println("B is moving");
    }
    public static void main(String[] args) {
        B secondClass = new B();
        secondClass.move();
    }
}

/*
    class B is child class of class A
    here we override move method in class B so that move() method from class B will run
    while making object in main methods of child class we will make object from name of our child class (i.e. B) like B secondClass = new B();
*/