package _19_Exception_Handling._02_Exception_Handling._02_Finally_Block;

public class FinallyBlock {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println("first");                    // 1.

        System.out.println();
        
        try {
            System.out.println(a[8]);                   // 2. 
        }
        catch (Exception e){
            System.out.println(e.getMessage());         // 3.
        }
        finally{
            System.out.println("I am finally and i will run always");   // 4.
        }

        System.out.println();

        System.out.println("last");                     // 5.
    }
}

/*
    1. This will execute first.
    2. We will put the code in try block when we think that piece of code will give any particular exception then catch block 
       will execute.
    3. If that code gives any exception, this will execute
    4. But even if exception come or not this finally block will always execute
       NOTE : We can directly use finally block without even using catch block
    5. This will execute even after exception occurs.
*/