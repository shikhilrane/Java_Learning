/*                                                           TYPE PROMOTION IN JAVA
 * 1. type conversion happens only in expressions like a+b+_02_Stream
 * 2. char, byte, short, automatically gets converted into int when evaluating the expression
 * 3. if one operand is long float or double the whole expression gets promoted to long, float or double respectively
*/

package _07_Data_Conversion_and_Coersion_and_Promotion._03_Type_Promotion;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        byte b = 34;
        short c = 56;
        int d = a + b + c; //here char, byte and short gets converted to int automatically by compiler (it converts only in expression)
        System.out.println(d);
        byte e = (byte) (a + b + c); // we can still convert that int value to any form by type casting as we have converted int to byte or char or short but it gives senseless answer
        System.out.println(e);
        long f = 787;
        long g = d + f;
        int h = (int)(d + f); // if we get any higher data type than int then it will show output in that particular higher data type so we can cast it in any lower type of data if we want.
        System.out.println(h);

        long x = 65495;
        float y = 6777.88f;
        double z = 688.8989;
        double v = x + y + z;//as double is present here in the expression as a higher data type then it will convert all the other data type in double & if double is not present in expression then it will convert to float as float is the higher data type as compared to long but still we can convert that higher to lower by type casting
        System.out.println(v);
        long u =(long) (x + y + z);
        System.out.println(u);
    }
}
