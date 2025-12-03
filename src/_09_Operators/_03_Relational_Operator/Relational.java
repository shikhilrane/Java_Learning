// It is used to comapare two operands
// It checks equality
// it return output in either true or false

package _09_Operators._03_Relational_Operator;

public class Relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a==b); //checks if values of both operands are equal or not. If yes then true & if no then false

        System.out.println(a!=b); //checks if values of both operands are equal or not. If yes then false & if no then true

        System.out.println(a>b); //checks if value of one operand is greater or not with second operand. If yes then true & if no then false

        System.out.println(a<b); //checks if value of one operand is lesser or not with second operand. If yes then true & if no then false

        System.out.println(a>=b); //checks if value of one operand is greater or equal ,or not with second operand. If yes then true & if no then false

        System.out.println(a<=b); //checks if value of one operand is less or equal ,or not with second operand. If yes then true & if no then false
    }
}
