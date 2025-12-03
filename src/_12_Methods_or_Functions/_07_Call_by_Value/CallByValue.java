package _12_Methods_or_Functions._07_Call_by_Value;

public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // int temp = a;                                    /* here if we make this kind of swap program then original value will change and if we
        // a = b;                                              want to use our original value (i.e a=5 and b=10) further, we cant use them as
        // b = temp;                                           changed our original values are changed
        // System.out.println("Value of a becomes " + a);
        // System.out.println("Value of b becomes " + b);   */

        swap(a, b);

    }
    public static void swap(int a,int b){                   // but by using method we can temporary change our value for specific opn and restore
        int temp = a;                                       // original value for further operation. This is called a call by value, in which original
        a = b;                                              // doesn't get change, copies of made. All the java methods use call by value
        b = temp;                                           // call by reference is where the original value gets change in function, it is followed
        System.out.println("Value of a becomes " + a);      // C++ programming and not by Java
        System.out.println("Value of b becomes " + b);
    }
}
