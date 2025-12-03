package _17_OOPS._04_Encapsulation._03_Importing_package;

// we have to import packages or classes after package path and before public class 
import java.util.Scanner;   // this will only import Scanner class. (we cant use other classes of util if we only import single class)
import java.util.*;         // this will import whole util package. (we can use other classes of util if we use *. here, like ArrayList.class, Map.class,etc will be accessed)

public class Understanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
