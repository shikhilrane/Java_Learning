package _23_Collection_Framework._01_Collection_Interface._03_Set._04_EnumSet;

// EnumSet is perfect when you want to work with sets of enum values.
// More efficient than HashSet<Enum>.
// Doesn't allow null.
// Maintains enum constant order.

import java.util.EnumSet;

// Define an enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class LearnEnumSet {
    public static void main(String[] args) {

        // Create an EnumSet with specific days
        EnumSet<Day> workDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
        System.out.println("Work Days: " + workDays);

        // Create an EnumSet with all constants
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All Days: " + allDays);

        // Create an empty EnumSet
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println("No Days: " + noDays);

        // Add elements to EnumSet
        noDays.add(Day.SUNDAY);
        noDays.add(Day.SATURDAY);
        System.out.println("Weekend Days: " + noDays);

        // Complement of a set (inverse of workDays)
        EnumSet<Day> weekendDays = EnumSet.complementOf(workDays);
        System.out.println("Weekend (using complementOf): " + weekendDays);

        // Remove a day
        workDays.remove(Day.WEDNESDAY);
        System.out.println("Work Days after removing Wednesday: " + workDays);
    }
}
