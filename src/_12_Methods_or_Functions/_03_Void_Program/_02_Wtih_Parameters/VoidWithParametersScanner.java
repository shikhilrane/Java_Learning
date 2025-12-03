package _12_Methods_or_Functions._03_Void_Program._02_Wtih_Parameters;

import java.util.*;

public class VoidWithParametersScanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        addn(a, b);
    }
    public static void addn(int num1, int num2){
        int addn = num1+num2;
        System.out.println("Sum of these two numbers is " + addn);
    }
}
