package _12_Methods_or_Functions._09_Math_class;

public class MathClass {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(Math.min(a, b));     // inbuilt java math class     4<2 = 2
        System.out.println(Math.max(a, b));     // inbuilt java math class     4>2 = 4
        System.out.println(Math.sqrt(a));       // inbuilt java math class     square-root of 4 = 2.0
        System.out.println(Math.pow(a, b));     // inbuilt java math class     4^2 = 16.0
        System.out.println(Math.abs(-4));       // inbuilt java math class     -4 = 4 (it change negative value to positive)
        System.out.println(Math.floor(4.6));    // inbuilt java math class     it gives previous integer of float or double value i.e. here 4.0
        System.out.println(Math.ceil(4.4));     // inbuilt java math class     it gives the next integer of float or double value i.e. here 5.0
        System.out.println(Math.round(4.1));    // inbuilt java math class     it round off the value to next integer i.e. here 4
        System.out.println(Math.random());      // inbuilt java math class     it generates random number from 0 to <1
        // Understanding random
        System.out.println((int)((Math.random()*6+1))); // this will generate any random between 1 and 6
    }
}
