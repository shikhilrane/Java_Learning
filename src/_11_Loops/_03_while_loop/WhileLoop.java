//                                                                     WHILE LOOOP
// 1. while loop is used when we don't know the number of iterations
// 2. we use relational operators (<, >, <=, >=, ==, !=) in condition of while loop
// 3. we need to provide a true condition that would get false after the several number of iterations we set
// 4. to increase or decrease the counter we need to use assignment operator i.e. ++ or -- respectively

package _11_Loops._03_while_loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        // 1st condition is simple program for while loop
        // System.out.print("enter number less than 5 : ");
        // int counter = sc.nextInt();
        int counter = 1;        // this is counter which counts the number of iterations

        while (counter <= 5) {      // condition sets counter which is set 1 initially & total number of operations that is 5 if condition saisfies it will execute the code
            System.out.println("Hi");
            counter++;      //this is used to increase the number of counter by 1, after this it will again check the condition if it within condition then it will execute the code & again increase the counter by 1 using ++
        }

        // 2nd condition in which we used to increment the sequence of the number to print the specific range of numbers
        System.out.print("enter number less than 10 : ");
        int counter1 = sc.nextInt();

        while (counter1 <= 10) {        // if counter increases then we have to use < or <= and value of LHS < RHS
            System.out.println(counter1);
            counter1++;     // we need to use ++ to increase the counts of counter
        }

        // 3rd condition in which we used to decrement the sequence of the number
        System.out.print("enter number greater than 0 : ");
        int counter2 = sc.nextInt();

        while (counter2 >= 0) {        // if counter decreases then we have to use > or >= and value of LHS > RHS
            System.out.println(counter2);
            counter2--;     // we need to use -- to decrease the counts of counter
        }

        // 4th condition in which we can take both condition as input (n is input from user but num we declare before)
        System.out.println("enter number greater than 1");
        int n = sc.nextInt();
        int num = 1;

        while (num <= n) {
            System.out.println("print");
            num++;
        }

        // 5th condition in which booleans can be used which is even a best example of we dont know how many iteration we want to take
        System.out.println("Are you attending office? : ");
        boolean yORn = sc.nextBoolean();
        while (yORn==false) {
            System.out.println("Please attend! otherwise we will keep asking you again and again until you say \'Yes\' to attend office");
            yORn = sc.nextBoolean();
        }
        System.out.println("Ok! come tomorrow at 10AM, good luck");
    }
}
