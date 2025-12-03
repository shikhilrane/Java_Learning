/*                                                               TYPE CONVERSION
   1. when we convert one type of data into another type of data
   2. we can convert only numbers into each other (i.e. byte, short, int, long, float, double)
   3. type conversion happens when type compatible & destination type > source type
   4. this is also called widening conversion or implicit conversion
   5. byte => short => int => long => float => double (here byte can be converted into any of data type as it is a smallest type of data type but double cant be converted into any of the data type as it is largest data type in at all size of these is a follows 1 byte => 2 byte => 4 bytes => 8 byte => 4 byte => 8 bytes respectively (here we know size of long is greater than float but still java prefer float over long because float is in decimal form.)
 */

package _07_Data_Conversion_and_Coersion_and_Promotion._01_Type_Conversion;

import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // by taking input from user
        System.out.print("enter value from the user : ");
        float num = sc.nextInt(); //we can convert integer into float but can't convert float into integer
        System.out.println(num);

        // OR

        int a = 6;
        float b = 7f;
        b=a; // here we assigned value of a to b
        System.out.println(b);

        long fl = 34;
        float l = fl;
        System.out.println(l);
    }
}
