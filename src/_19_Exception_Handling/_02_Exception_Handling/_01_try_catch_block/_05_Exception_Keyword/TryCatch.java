package _19_Exception_Handling._02_Exception_Handling._01_try_catch_block._05_Exception_Keyword;

public class TryCatch {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("first");                    // 1.

        System.out.println();
        
        try {
            int result = 5/0;                           // 2.
            System.out.println(a[8]);                   // 3. 
        }
        catch (Exception e){
            System.out.println(e.getMessage());         // 4.
        }

        System.out.println();

        System.out.println("last");                     // 5.
    }
}

/*
    1. This will execute first.
    2. We will put code in try block when we think that piece of code will give any particular exeption then it's related catch 
       block will execute.
    3. If that above code gives exception then this will not be checked. if that above statement doesn't give execption then 
       this will be checked and find execption here. then its related catch block will execute.
    4. We put all the Exception in single block by using Exeption keyword without naming all the Exceptions name as we did in 
       4th folder. So that if any kind of exception occurs in try block then this single catch block will execute for any cases of exception.
    5. This will execute even after exception occurs.
*/