package _12_Methods_or_Functions._09_Math_class;

public class RandomMethodMath {
    public static void main(String[] args) {
        System.out.println((int)((Math.random()*6)+1));                 // to generate from 1 to n random numbers

        int maxN = 20;
        int minN = 10;
        System.out.println((int)((Math.random()*(maxN-minN+1))+minN));  // to generate from min_n to max_n random numbers
    }
}
