// 4

package _17_OOPS._04_Encapsulation._06_Static_keyword;

public class staticCount {
    public static void main(String[] args) {
        ClassOne co1 = new ClassOne();
        ClassOne co2 = new ClassOne();
        System.out.println(ClassOne.count);         // it will print how many times we use ClassOne class to make object
    }
}

/*
    1. made a constructor in ClassOne class to check how many objects are being made for class ClassOne
*/
