// if there are multiple entities to compare then we use else if loop
// we can use as many as else if statements as we want

package _10_Conditional_Statement._03_if_elseIf_else;

import java.util.*;

public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();

        if (a <= 12) {
            System.out.println("you are kid");
        }
        else if (a > 12 && a < 18) {                // we have applied multiple condition
            System.out.println("you are teenager");
        }
        else {
            System.out.println("You are adult");
        }
    }
}
