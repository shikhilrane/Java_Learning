package _12_Methods_or_Functions._04_DataType_as_Return_type._02_Wtih_Parameters;

// return type as datatype with parameters and scanner class

import java.util.Scanner;

public class WithParametersScanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = addn(a, b);
        System.out.println("Sum is " + sum);
    }
    public static int addn(int num1, int num2){
        int addn = num1+num2;
        return addn;
    }
}
