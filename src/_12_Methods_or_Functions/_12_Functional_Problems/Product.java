package _12_Methods_or_Functions._12_Functional_Problems;

public class Product {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        newBool(num1, num2);
    }
    public static void newBool(int a, int b){
        int prod = a*b;
        System.out.println("Product of these two numbers is " + prod);
    }
}
