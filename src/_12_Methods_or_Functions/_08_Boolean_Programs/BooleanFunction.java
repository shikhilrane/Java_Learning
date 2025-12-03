package _12_Methods_or_Functions._08_Boolean_Programs;

import java.util.Scanner;

public class BooleanFunction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        int num1 = scn.nextInt();
        System.out.print("Enter value for b : ");
        int num2 = scn.nextInt();
        System.out.print("Want to perform operation? : ");
        boolean decision = scn.nextBoolean();

        int summation = addition(num1, num2, decision);
        System.out.println("Addition of these two numbers is " + summation);
    }
    public static int addition(int a, int b, boolean shouldAdd){
        if (shouldAdd==false) {
            return 0;
        }
        int sum = a+b;
        return sum;
    }
}
