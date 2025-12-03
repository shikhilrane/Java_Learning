// in conditional statements we compare the values with relational operators like >, <, >=, <=, !=, ==
// if, if condition of statements gets true then code within if will gets executed otherwise else will execute

package _10_Conditional_Statement._02_if_else;

import java.util.*;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Put your age");
        int age = sc.nextInt();

        if (age >= 18) {                                                // if value of age is greater or equal to 18, then this will be execute
            System.out.println("Congrats!!! You are eligible to vote");
        } else {                                                        // if value of age is lesser than 18, then this will be execute
            System.out.println("Sorry you are not eligible to vote");
        }
    }
}
