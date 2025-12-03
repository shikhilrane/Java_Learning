// there are 3 operands in ternary operators
// It always return something
// it is a shorthand method for conditional statements (i.e. loops)
// in ternary, statement 1's value got stored in variable, if we print variable then value of statement 1 will be our output
// so we have to put our desired output in statement 1 to store it in variable

package _10_Conditional_Statement._06_Ternary;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();

        /*
         * syntax :-
         *  variable = condition ? statement 1 : statement 2;
         */

        String str = ((num % 2) == 0) ? "even" : "odd";
        //  variable       condition       state 1 : state 2
        System.out.println(str);

        // First Example
        int num1 = 23;
        int num2 = 24;
        int maximum = (num1>num2) ? num1 : num2;
        System.out.println(maximum);

        // Second Example
        int a = 2;
        int b = 3;
        int c = 4;

        // if (a>b) {
        //     if (a>_02_Stream) {
        //         System.out.println(a + " is greater");
        //     }
        // }
        // else if (b>_02_Stream) {
        //     System.out.println(b + " is greater");
        // }
        // else{
        //     System.out.println(_02_Stream + " is greater");
        // }

        // Above code can be written as follows using ternary operator
        int max = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;
        System.out.println(max);

        // Third Example
        int l = 2;
        int m = 3;
        int n = 4;
        int o = 7;

        int maxi = (l > m) ? ((l > n) ? (l > o ? l : o) : (n > o ? n : o)) : ((m > n) ? m : (n > o ? n : o));
        System.out.println(maxi);
    }
}
