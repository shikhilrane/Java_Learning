package _13_Arrays._03_Creating_an_Array._03_Inputting_Array_Value;

// This way we can input values for array index by user

import java.util.*;

public class InpArrayValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rollNumbers[] = new int[20];
        System.out.print("Enter roll number for 1st student : ");
        rollNumbers[0] = scn.nextInt();
        System.out.print("Enter roll number for 2nd student : ");
        rollNumbers[1] = scn.nextInt();
        System.out.print("Enter roll number for 3rd student : ");
        rollNumbers[2] = scn.nextInt();
        System.out.print("Enter roll number for 4th student : ");
        rollNumbers[3] = scn.nextInt();

        System.out.println("Roll number of 1st student is "+ rollNumbers[0]);
        System.out.println("Roll number of 4th student is "+ rollNumbers[3]);
        System.out.println("Roll number of 6th student is "+ rollNumbers[5]);

                                                            //  OR

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you put in array : ");
        int inputs = sc.nextInt();  // Taking input for total numbers of inputs we want to put

        int[] array = new int[inputs];

        for (int i = 0; i < array.length; i++) {    // Traverse a loop to put all the elements in an array
            System.out.print("Enter value for index " + i + " : ");
            array[i] = sc.nextInt();    // It will keep put every entry in an array
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
