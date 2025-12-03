package _19_Exception_Handling._02_Exception_Handling._01_try_catch_block._01_Understanding_handling;

public class HowExceptionOccurs {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("first");            // This line will print
        System.out.println(a[8]);               // we tried to access array more than its length
        System.out.println("last");             // everything after exception will not execute
    }
}

/*
    1. here first line will execute
    2. at this point, ArrayIndexOutOfBoundsException will occur and our program will stop executing
    3. this line will not execute as our program is stopped executing because of ArrayIndexOutOfBoundsException
*/