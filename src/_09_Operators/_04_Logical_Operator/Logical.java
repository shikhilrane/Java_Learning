// LO is used to check if multiple statements within expressions are true or false
// It shows output in true or false

package _09_Operators._04_Logical_Operator;

public class Logical {
    public static void main(String[] args) {
        System.out.println((3>2) && (8>4)); //logical AND, as both are true it returned true in output and if any of the statement is false then it will return false

        System.out.println((2>3) || (4>8)); //logical OR, as both are false it returned false in output and if any of the statement is true then it will return false true

        System.out.println(!(4<5)); //logical NOT, it will return true if statement is false & return false if statement is true
    }
}
