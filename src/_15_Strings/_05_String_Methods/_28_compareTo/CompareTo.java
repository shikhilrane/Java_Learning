package _15_Strings._05_String_Methods._28_compareTo;

public class CompareTo {
    public static void main(String[] args) {
        // Compares two String's data
        System.out.println("Shikhil".compareTo("Shikhil"));
        System.out.println("ShikhilRane".compareTo("Shikhil"));
        System.out.println("Shikhil".compareTo("ShikhilRane"));
        System.out.println("Shikhil".compareTo("SHikhil")); // 32, because h = 104 H = 72, h-H = 104-72 = 32

        // Ignores case
        System.out.println("Shikhil".compareToIgnoreCase("SHikhil"));
    }
}

/*
    both equals = 0
    first string greater = positive
    first string smaller = negative

*/