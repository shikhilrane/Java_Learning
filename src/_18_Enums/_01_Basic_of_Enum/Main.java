package _18_Enums._01_Basic_of_Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Print an enum constant
        System.out.println("Day: " + Day.TUESDAY);

        Day friday = Day.FRIDAY;

        // 2. Get the index (position) of the enum constant
        System.out.println("Index of Friday: " + friday.ordinal());

        // 3. Get the enum constant name as a String
        System.out.println("Name of Friday: " + friday.name());

        // 4. Convert the enum name to lowercase
        System.out.println("Lowercase name of Friday: " + friday.name().toLowerCase());

        // 5. Get an enum constant from its String name
        Day monday = Day.valueOf("MONDAY");
        System.out.println("The day: " + monday);

        // 6. Get all enum constants as an array
        Day[] values = Day.values();
        for(Day i : values){                         // This will print values of an Array
            System.out.println("Day: " + i);
        }

        // Convert the enum array into a String for printing
        System.out.println("Values: " + Arrays.toString(values)); // This will convert array to string

        // 7. Displaying name through display method to get name (because And as this will get converted into the class, then we can even make method in it)
        friday.display();
    }
}
