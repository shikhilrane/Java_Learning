package _19_Exception_Handling._02_Exception_Handling._01_try_catch_block._06_Methods_of_Exception;

public class ExceptionMethods {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("first");

        System.out.println();
        
        try {
            int result = 5/0;
            System.out.println(a[8]);
        }
        catch (Exception e){
            System.out.println(e.equals(e));                // it will compare e with e
            System.out.println(e.getLocalizedMessage());    // it will give what exception occurs
            System.out.println(e.getMessage());             // it will give what exception occurs
            System.out.println(e.hashCode());               // it will give hashCode of e
            System.out.println(e.toString());               // it will address of e (similar to e)
            System.out.println(e.fillInStackTrace());       // it will address of e (similar to e)
            System.out.println(e.getCause());               // reason of exception
            System.out.println(e.getClass());               // gives reason of exception
            System.out.println(e.getStackTrace());          
            System.out.println(e.getSuppressed());
        }

        System.out.println();

        System.out.println("last");
    }    
}
