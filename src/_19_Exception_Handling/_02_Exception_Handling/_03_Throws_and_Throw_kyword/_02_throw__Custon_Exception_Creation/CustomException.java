package _19_Exception_Handling._02_Exception_Handling._03_Throws_and_Throw_kyword._02_throw__Custon_Exception_Creation;

import java.util.*;

public class CustomException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      // 4
        System.out.print("enter age : ");       // 5

        try{                                    // 6
            int age = sc.nextInt();             // 7
            if (age>100) {                      // 9
                throw new MyException("MyException has run, so there is an error");     // 10
                // throw new ArithmeticException("More than 100 not allowed");          // 13
            }
            System.out.println("It's a valid age");     // 8
        } catch(Exception e){                   // 11
            System.out.println(e);              // 12
        }

    }
}

class MyException extends Exception{        // 1
    public MyException(String message){     // 2
        super(message);                     // 3
    }
}

/*
    1. made a class MyException and extends this custom class with Exception class that is present in java.lang package
    2. Created a constructor and passed StringClass message (StringClass message is standard) in it
    3. Access a message from its parent class (super (message) is constant) to display message that we gonna type in bracket of 
       our custom exception (to throw custom exception, exactly this type of class should be made)
    4. Used a Scanner class to take input from user
    5. asked for age from user
    6. try block
    7. took input from the user
    8. if entered age is less than 100 then this will execute
    9. if age is greater than 100
   10. we will use throw our custom exception by stating 'throw new ClassNameOfException()' sentence inside bracket will execute
   11. to show above message, it has to enter in catch block
   12. it will let you show message inside custom exception
   13. we can throw inbuilt exception like this
*/