package _15_Strings._05_String_Methods._22_format;
// Use to format the string

public class format {
    public static void main(String[] args) {
        String name = "Java";
        int version = 25;

        String result = String.format("%s version %d", name, version);

        System.out.println(result);
    }
}

/*
    Common format specifiers
    Specifier	    Use
    %s	            String
    %d	            Integer
    %f	            Floating-point
    %c	            Character
    %b	            Boolean
    %.2f	        Decimal ke 2 digits
*/