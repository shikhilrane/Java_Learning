package _12_Methods_or_Functions._03_Void_Program._01_Without_Parameters;

import java.util.*;

public class VoidWithoutParameterScanner {
    public static void main(String[] args) {
        addn();
    }
    public static void addn(){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int addn = a+b;
        System.out.println("addition of these two numbers is "+addn);
    }
}
