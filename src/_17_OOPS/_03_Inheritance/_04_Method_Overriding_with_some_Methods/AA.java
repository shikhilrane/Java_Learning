package _17_OOPS._03_Inheritance._04_Method_Overriding_with_some_Methods;

// main class

public class AA {
    String name;
    int letters;
    void move(){
        System.out.println("AA is moving");
    };
    public static void main(String[] args) {
        AA firstClass = new AA();
        firstClass.move();
    }
}
