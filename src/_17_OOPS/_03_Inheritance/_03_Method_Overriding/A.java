package _17_OOPS._03_Inheritance._03_Method_Overriding;

// Main class

public class A {
    void move(){
        System.out.println("A is moving");
    };
    public static void main(String[] args) {
        A firstClass = new A();
        firstClass.move();
    }
}

// A is our main class