package _19_Exception_Handling._02_Exception_Handling._03_Throws_and_Throw_kyword._01_throws;

public class ThrowsKeyword {
    public static void main(String[] args) {
        int a[] = new int[5];                   // 1

        try {                                   // 3
            getNumberFromArray(a);
        } catch (Exception e) {                 // 4
            System.out.println("Exception occurs here : " + e.getMessage());
        }
    }

    static int getNumberFromArray(int a[]) throws Exception{    // 2
            return a[8];
    }
}

/*
    1. created an array of length 5
    2. created a method in which passed a array as a parameter, if we think this method can throw error, then we can simply
       state throws exception with method
    3. then we put method calling in try block.
    4. If method calling throws any exception then this catch block will execute.
*/
