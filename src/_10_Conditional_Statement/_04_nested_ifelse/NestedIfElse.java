//if there are condtions of conditions then we we use nested loop

package _10_Conditional_Statement._04_nested_ifelse;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put age");
        int ag = sc.nextInt();

        if (ag <= 12) {                                 // if this gets true it will enter in this condition
            if (ag <= 5) {                              // it will check multiple condition inside parent condition statement
                System.out.println("You are a toddler");
            }
            else {
                System.out.println("You are a child");
            }
        }
        else if (ag > 12 && ag < 18) {
            System.out.println("you are teenager");
        }
        else {
            System.out.println("You are an adult");
        }
    }
}
