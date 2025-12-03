package _12_Methods_or_Functions._02_BoilerplateCode;

// A. here, access modifier is the type of which access you giving to function, return type is which type of returning from the function i.e. int or double or long or byte or boolean, function name is which defines name of the function but here it is a main function to start java program, string as an array is, main function asks for some arguments so it automatically take string as an array (here we can change name of array, by default it is args but we can change it to anything)
// static means the method or variable belongs to the class, not to an object
    // Static method → Can be called without creating an object.
    // Static variable → Shared across all objects of the class.

public class BoilerPlate {
//  access      return  function  string as an      ---|
//  modifier    type    name        array              | A.
//    ||         ||     ||          ||                 |
//     V          V     V           V               ___|
    public static void main(String[] args) {
        fun1();
        fun2(4, 20);
        int resultFun3 = fun3(6, 3);
        System.out.println(resultFun3);
    }

    public static void fun1(){          // we made this method static because, main method is always a static method
        System.out.println("Hello");
    }

    public static void fun2(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int fun3(int a, int b){
        int multiplication = a*b;
        return multiplication;
    }
}
