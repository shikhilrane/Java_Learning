package _18_Enums._01_Basic_of_Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Print any day from Enum Day
        System.out.println(Day.TUESDAY);

        Day friday = Day.FRIDAY;

        // 2. Checking index of the input
        System.out.println(friday.ordinal());

        // 3. Converting Enum to StringClass
        System.out.println(friday.name());
        System.out.println(friday.name().toLowerCase());

        // 4. Checking if enum is present in Enum class
        Day allday = Day.valueOf("MONDAY");
        System.out.println(allday);

        // 5. Iterating over an Enum
        Day[] values = Day.values();
        System.out.println(Arrays.toString(values)); // This will convert array to string
        for(Day i : values){                         // This will print values of an Array
            System.out.println(i);
        }

        // 6. Displaying name through display method to get name (because And as this will get converted into the class, then we can even make method in it)
        friday.display();
    }
}
