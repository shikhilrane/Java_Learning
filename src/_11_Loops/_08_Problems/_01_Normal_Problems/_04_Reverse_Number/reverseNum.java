package _11_Loops._08_Problems._01_Normal_Problems._04_Reverse_Number;

// Q. Reverse the number

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = scn.nextInt();
        int num = n;
        int reverse = 0;

        while (num>0) {
            int lastDigit = num%10;
            reverse = (reverse*10)+lastDigit;
            num = num/10;
        }
        System.out.println("Reverse of the " + n + " is " + reverse);

        // Another way without taking user output
        int num1 = 2354;
        int rev = 0;
        while (num1>0){
            int lastDigit = num1%10;
            rev = (rev*10) + lastDigit;
            num1 = num1/10;
        }
        System.out.println("Sum of digits of given number = " + rev);
    }
}

/*
    Dry run :-
    input: 6543

    1.num = 6543
    2.num1 = 6543
    3.reverse = 0

    Iteration 1:
    •revNum = 6543 % 10 = 3
    •reverse = (0*10) + 3 = 3
    •num1 = 6543 / 10 = 654

    Iteration 2:
    •revNum = 654 % 10 = 4
    •reverse = (3*10) + 4 = 34
    •num1 = 654 / 10 = 65

    Iteration 3:
    •revNum = 65 % 10 = 5
    •reverse = (34*10) + 5 = 345
    •num1 = 65 / 10 = 6

    Iteration 4:
    •revNum = 6 % 10 = 6
    •reverse = (345*10) + 6 = 3456
    •num1 = 6 / 10 = 0

    While loop ends.

    Output: Reverse of the 6543 is 3456
 */