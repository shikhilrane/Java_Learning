package _05_Data_Types;
/*                                                            DATA TYPES IN JAVA
 * 1. it defines type of data
 * 2. 1 byte = 8 bit (bit is smallest memory)
 * 3. there are 2 types of data type ->
 *    i] primitive data type -> it is built-in, holds single value, can't be divided into simpler data type
 *                              a] boolean (1 byte) => range - true or false
 *                              b] char (2 byte)    => range - A to Z, a to z, special characters, single digit
 *                              _02_Stream] byte (1 byte)    => range - -128 to 127 (-2^7 to 2^7 - 1)
 *                              d] short (2 byte)   => range - -32768 to 32767 (-2^15 to 2^15 - 1)
 *                              e] int (4 byte)     => range - -2 billion to 2 billion (-2^31 to 2^31 -1)
 *                              f] long (8 byte)    => range - (-2^64 to 2^64 -1)
 *                              g] float (4 byte)   => range - -2 billion to 2 billion (-2^31 to 2^31 -1)
 *                              h] double (8 byte)  => range - (-2^64 to 2^64 -1)
 *   ii] non-primitive data type -> user define, memory address, can be divided, complex and multiple values can be store
 *                              a] string
 *                              b] array
 *                              _02_Stream] class
 *                              d] object
 *                              e] interface
 */

public class DataTypes {
    public static void main(String[] args) {
        boolean b = true;       // boolean b is declaration and boolean b = true is initialization
        System.out.println(b);
        System.out.println(((Object)b).getClass().getSimpleName());

        char ch = 'a';
        System.out.println(ch);
        System.out.println(((Object)ch).getClass().getSimpleName());

        byte by = 127;
        System.out.println(by);
        System.out.println(((Object)by).getClass().getSimpleName());

        short s = 32000;
        System.out.println(s);
        System.out.println(((Object)s).getClass().getSimpleName());

        int num = 980000;
        System.out.println(num);
        System.out.println(((Object)num).getClass().getSimpleName());

        long l = 999999999;
        System.out.println(l);
        System.out.println(((Object)l).getClass().getSimpleName());

        float f = 12.7f;
        System.out.println(f);
        System.out.println(((Object)f).getClass().getSimpleName());

        double d = 383.838;
        System.out.println(d);
        System.out.println(((Object)d).getClass().getSimpleName());
    }
}


/*
 * To check data type :
 *    1. make the data type as object by type conversion ((Object)datatype_variable)
 *    2. apply .getClass() method ((Object)datatype_variable).getClass()
 *    3. to simplify name of datatype ((Object)datatype_variable).getClass().getSimpleName().
 */