package _19_Exception_Handling._02_Exception_Handling._01_try_catch_block._03_Handling_Exeption_With_Multiple_catch;

public class MultipleCatch {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("first");                    // 1.

        System.out.println();

        try {
            int result = 5/0;                           // 2.
            System.out.println(a[8]);                   // 3.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());         // 4.
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());         // 5.
        }

        System.out.println();

        System.out.println("last");                     // 6.
    }    
}

/*
    1. This will execute first.
    2. We will put code in try block when we think that piece of code will give any particular exeption then it's related catch 
       block will execute.
    3. If that above code gives exception then this will not be checked. if that above statement doesn't give execption then 
       this will be checked and find execption here. then its related catch block will execute.
    4. If ArrayIndexOutOfBoundsException Exeption found then this catch block will execute.
    5. If ArithmeticException Exeption found then this catch block will execute.
    6. This will execute even after exception occurs.
*/