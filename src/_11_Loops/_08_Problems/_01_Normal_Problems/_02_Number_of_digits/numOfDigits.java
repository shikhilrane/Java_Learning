package _11_Loops._08_Problems._01_Normal_Problems._02_Number_of_digits;

import java.util.*;

// Q. Count the number of digits for a given number n

public class numOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scn.nextInt();            // 1.
        int num1 = num;                     // 2.
        int ans = 0;                        // 3.
        while (num1>0) {                    // 4.
            num1 = num1/10;                 // 5.
            ans++;                          // 6.
        }
        System.out.println("There are "+ ans + " number of digits in " + num );     // 7.

        // another with simpler form
        int n = 235445;
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println("Total number of Digits = " + count);
    }
}

/*
    Steps in which above program is executed
    In step 1., we took input from the user
    In step 2., we made copy of our original number so that our orignal number doesn't get change and it is good prctice to made copy & perform operations on copy.
    In step 3., we made an answer variable to save number of counts from the loop
    In step 4., we used while loop as we know condition, condition is divide the number till it gets zero
    In step 5., we divided user inputed number by 10 so that last digit got eliminated
    In step 6., we increased number of count (It will count number of iteration loop will take)
    In step 7., we printed the number of iteration i.e. ans with original number i.e. num

    dry run of the code :-
    declaring variables for further program -
    suppose number from the user is 123. (i.e int num = 123;)
    we made copy of original number (i.e. int num1 = num;)
    then we made variable to save number of iteration in loop (i.e. int ans = 0;)
    iteration 1 -
    then we used while loop (i.e. while(num1>0))
    inside loop we divide our number with 10 to eliminate last digit (i.e. 123/10=12, here num1 will become 12 after this)
    then we updated the number of iteration (i.e. ans++, here ans will become 1)
    iteration 2 -
    again num1 (with value 12) will enter in the loop, loop will check if value of num1>0?
    as the num1 is 12 it will enter into the loop again
    then again num1 will be divided by 10 (i.e. 12/10, here num1 will become 1 after this)
    then we updated the number of iteration (i.e. ans++, here ans will become 2)
    iteration 3 -
    again num1 (with value 1) will enter in the loop, loop will check if value of num1>0?
    as the num1 is 1 it will enter into the loop again
    then again num1 will be divided by 10 (i.e. 1/10, here num1 will become 0 after this)
    then we updated the number of iteration (i.e. ans++, here ans will become 3)

    exit from the loop
    again num1 (with value 0) to enter in the loop, loop will check if value of num1>0?
    but now value of num1 becomes 0 it will get executed from the loop
    then we take exit from the loop and will print number of iteration we record during the loop operation till number become 0

    while (123>0){
        num1 = 123/10=12
        ans = 1
    }
    while (12>0){
        num1 = 12/10=1
        ans = 2
    }
    while (1>0){
        num1 = 1/10=0
        ans = 3
    }
 */