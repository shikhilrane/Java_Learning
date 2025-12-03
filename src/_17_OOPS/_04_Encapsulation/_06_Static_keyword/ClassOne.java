package _17_OOPS._04_Encapsulation._06_Static_keyword;

// 1

public class ClassOne {
    static int count = 0;   // static keyword depends only on class (it only makes one copy throughout the class)
    public ClassOne(){
        count++;
    }

    public static void main(String[] args) {
        ClassTwo.greeting();    // we can even directly use ClassTwo's static method without creating its object
    }
}