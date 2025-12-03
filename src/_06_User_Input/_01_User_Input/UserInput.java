/*                                                                 INPUT FROM USER IN JAVA
 * 1. it allows user to take input from console
 * 2. input belongs to java.util package (package is in which scanner class is present)
 * 3. it is use to print input of primitive data type (i.e. boolean, string, byte, short, int, long, float, double)
 * 4. we need to write import java.util.*; to use java input from user
 * 5. some terminology =>
 *                      i. class = user defined blueprint of method & variables in particular kind of object
 *                     ii. object = it is a instance of class & it is a real world entity
 *                    iii. package = group of classes
 */

package _06_User_Input._01_User_Input;

import java.util.*;         // this (i.e util) is a package in which Scanner class is present

public class UserInput {
    public static void main(String[] args) {
        //taking input as a boolean
        Scanner bl = new Scanner(System.in);         //here Scanner is class in which bl is an object & system is class which provide streams to get input and get output and also to print errors & in means input. also, combining System.in means to take i/p from default i/p stream i.e. keyboard
        System.out.println("enter true or false");
        boolean result = bl.nextBoolean();          //here we stored our input in result variable using boolean data type and bl.nextBoolean is method to take input as a boolean for object bl
        System.out.println("your result is \'Pass\' i.e." + "(" + result + ")");

        // taking input as single word
        Scanner sc = new Scanner(System.in);
        System.out.println("put your first name");
        String name = sc.next();
        System.out.println("your first name is " + name);

        //taking input as line or multiwords
        Scanner fn = new Scanner(System.in);
        System.out.println("Put your full name");
        String fullname = fn.nextLine();
        System.out.println("Your full name is " + fullname);

        //taking input as a byte
        Scanner bs = new Scanner(System.in);
        System.out.println("put number of students in your class");
        byte batch_Strength = bs.nextByte();
        System.out.println("total number of students in your class = " + batch_Strength);

        //taking input as short
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your monthly salary");
        short monthly = sh.nextShort();
        System.out.println("your salary = " + monthly);

        //taking input as int
        Scanner age = new Scanner(System.in);
        System.out.println("put your age");
        int a = age.nextInt();
        System.out.println("Your age is " + a);

        //taking input as long
        Scanner lo = new Scanner(System.in);
        System.out.println("enter your salary");
        long salary = lo.nextLong();
        System.out.println("your salary = " + salary);

        // taking input as float value
        Scanner fl = new Scanner(System.in);
        System.out.println("enter averge percentage you have got");
        float percentage = fl.nextFloat();
        System.out.println("average percentage = " + percentage);

        //taking input as double
        Scanner dl = new Scanner(System.in);
        System.out.println("enter net worth");
        Double networth = dl.nextDouble();
        System.out.println("net worth = " + networth);

        // reading character using scanner class
        Scanner ch = new Scanner(System.in);
        System.out.println("enter the word of which you to know indexing");
        char ch1 = ch.next().charAt(6);
        System.out.println("character at index 6 is " + ch1);

        System.out.println("enter the sentence of which you to know indexing"); //it work for same scanner class if input satisfies both the object i.e. object ch1 and object ch2. otherwise we want to make another class for this object (i.e. ch2). If we use same method for both objects i.e. ch.nextLine then we can take different input for both objects
        char ch2 = ch.nextLine().charAt(11);
        System.out.println("character at index 11 is " + ch2);
    }
}
