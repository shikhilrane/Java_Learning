package _15_Strings._05_String_Methods._27_format;

public class Format {
    public static void main(String[] args) {

        String name = "Shikhil";
        int age = 29;
        double salary = 95000.75;

        // Formatting a String
        String result = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);

        System.out.println(result);
    }
}

/*
    String format() Notes:
        1. format() is a static method of the String class.
        2. It is used to create a formatted String.
        3. It returns a new formatted String without modifying the original Strings.
        4. It works similarly to printf(), but returns a String instead of printing it.
        5. Common format specifiers:
            - %s : String
            - %d : Integer
            - %f : Floating-point number
            - %.2f : Floating-point with 2 decimal places
            - %c : Character
            - %b : Boolean
        6. It is commonly used for reports, logs, messages and formatted output.

    Execution:
        1. Create variables name, age and salary.
        2. Call String.format().
        3. Replace format specifiers with actual values.
        4. Store the formatted String in result.
        5. Print the formatted String.
*/