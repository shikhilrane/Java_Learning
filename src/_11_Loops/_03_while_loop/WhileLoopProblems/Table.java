package _11_Loops._03_while_loop.WhileLoopProblems;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number of which you want tto print table : ");
        int num = scn.nextInt();
        int i = 1;
        int table = 0;
        while (i<=10) {
            table = num*i;
            System.out.println(table);
            i++;
        }
    }
}
