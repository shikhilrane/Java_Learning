package _10_Conditional_Statement._01_If;

import java.util.*;

public class IfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        float marks = sc.nextFloat();

        if (marks>=33) {
            System.out.println("Congratulations!!! You are passed");
        }
    }
}
