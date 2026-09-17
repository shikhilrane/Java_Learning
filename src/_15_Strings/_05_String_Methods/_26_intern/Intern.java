package _15_Strings._05_String_Methods._26_intern;

public class Intern {
    public static void main(String[] args) {

        // String created in Heap Memory
        String s1 = new String("Java");

        // String created in String Constant Pool (SCP)
        String s2 = "Java";

        // Different references
        System.out.println(s1 == s2);          // false

        // intern() returns the reference from the String Constant Pool
        String s3 = s1.intern();

        // Now both references point to the same SCP object
        System.out.println(s1 == s3);          // false
        System.out.println(s2 == s3);          // true

        // Values are also equal
        System.out.println(s1.equals(s2));     // true
    }
}

/*
    String intern() Notes:
        1. intern() is a method of the String class.
        2. It returns the reference of the String from the String Constant Pool (SCP).
        3. If the String is already present in SCP, it returns the existing reference.
        4. If the String is not present in SCP, it is added to SCP and its reference is returned.
        5. intern() helps avoid duplicate String objects in the String Constant Pool.
        6. == compares object references.
        7. equals() compares String values.

    Execution:
        1. Create s1 in Heap Memory.
        2. Create s2 in the String Constant Pool.
        3. Compare s1 and s2 using == (false).
        4. Call s1.intern().
        5. intern() returns the SCP reference and stores it in s3.
        6. Compare s2 and s3 using == (true).
        7. Compare s1 and s2 using equals() (true).
*/