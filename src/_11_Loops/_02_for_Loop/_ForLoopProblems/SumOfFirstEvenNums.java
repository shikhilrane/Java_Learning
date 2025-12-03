package _11_Loops._02_for_Loop._ForLoopProblems;

public class SumOfFirstEvenNums {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int even_num = 2*i;
            System.out.println(sum + " + " + even_num +  " = " + (sum = sum+even_num));
        }
        System.out.println("Sum of first 10 even numbers are : " + sum);
    }
}
