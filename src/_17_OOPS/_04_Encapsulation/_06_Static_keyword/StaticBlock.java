// 3

package _17_OOPS._04_Encapsulation._06_Static_keyword;

public class StaticBlock {
    static {                                    // it executes when class is loading, we can initialise class in it
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main function");
    }

    static {                                    // it executes when class is loading
        System.out.println("Static block 2");
    }
}
/*
    1. flow of execution class load > function load > execution
    2. it is use when we want to initialise thing at time of class load
    3. use in development
*/