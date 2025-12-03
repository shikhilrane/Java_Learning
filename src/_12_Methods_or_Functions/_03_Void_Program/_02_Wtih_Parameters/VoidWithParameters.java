package _12_Methods_or_Functions._03_Void_Program._02_Wtih_Parameters;

public class VoidWithParameters {
    public static void main(String[] args) {
        addn(4, 9);
    }
    public static void addn(int a,int b) {
        int addn = a+b;
        System.out.println("Sum is " + addn);
    }
}
