/*                                                              TYPE CASTING
 * 1. converting higher data type to lower data type is called type casting
 * 2. it is done by programmer manually
 * 3. it is also called as narrowing or explicit type casting
 * 4. in type conversion compiler can't convert big size data type to small size data type so we can forcefully convert that big type of data size    into small size type using type casting method
 * 5. syntax => small data type name of variable = (small size data type) name of variable which you're converting
 * 6. we can even convert characters (A to Z or a to z) into numbers using type casing
*/

package _07_Data_Conversion_and_Coersion_and_Promotion._02_Type_Coersion;

import java.util.*;

public class TypeCoersion {
    public static void main(String[] args) {
        float a = 99.99999f;
        int b = (int) a; // here we have forcefully converted float value to integer with type casting so we lost .99999 here as it was after decimal & one more thing it directly deletes all digits after decimal so it doesn't make 100 here it make 99
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        long d = (long)c + 3; // here we have forcefully converted double value to long with type casting so we will lose number after decimal here
        System.out.println(d);

        // Character and Integer Relations
        char ch = 'A';
        char ch2 = 'Z';
        char ch3 = 'a';
        char ch4 = 'z';

        // Converting char to int (Type Conversion)
        int num = ch;
        int num2 = ch2;
        int num3 = ch3;
        int num4 = ch4;

        System.out.println(num); // value of A will be 65, B will be 66, C will be 67,.... Z will be 90
        System.out.println(num2);
        System.out.println(num3);// value of a will be 97, b will be 98, C will be 99,.... Z will be 122
        System.out.println(num4);

        // Converting int to char (Type Coersion)
        char newCh = (char) num;
        char newCh2 = (char) num2;
        char newCh3 = (char) num3;
        char newCh4 = (char) num4;

        System.out.println(newCh);
        System.out.println(newCh2);
        System.out.println(newCh3);
        System.out.println(newCh4);
    }
}
