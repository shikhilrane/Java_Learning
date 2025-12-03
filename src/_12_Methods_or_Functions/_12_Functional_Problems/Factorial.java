package _12_Methods_or_Functions._12_Functional_Problems;

public class Factorial {
    public static void main(String[] args) {
        facto(5);
    }
    public static void facto(int n){
        int i = 1;
        int factorial = 1;
        while (i<=n) {
            factorial = factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
