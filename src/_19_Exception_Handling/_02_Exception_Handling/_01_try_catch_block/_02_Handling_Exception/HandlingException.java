package _19_Exception_Handling._02_Exception_Handling._01_try_catch_block._02_Handling_Exception;

public class HandlingException {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("first");                    // 1.

        System.out.println();

        try {
            System.out.println(a[8]);                   // 2.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());         // 3.
        }

        System.out.println();

        System.out.println("last");                     // 4.
    }    
}

/*
    1. This will execute first
    2. We will put the code in try block when we think that piece of code will give any particular exception then catch block 
       will execute.
    3. If that code gives any exception, this will execute
    4. This will execute even after exception occurs
*/