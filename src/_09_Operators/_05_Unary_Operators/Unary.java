// it just wants a single operand to perform operation
// there are two types of unary operator 1. increment (pre and post) and 2. decrement (pre and post)

package _09_Operators._05_Unary_Operators;

public class Unary {
    public static void main(String[] args) {
        // Increment
        // 1. Pre-Increment
        int a = 10;
        System.out.println("Pure value = " + a); // output => 10
        System.out.println("value during unary operation =  " + (++a)); //it prior increments the value of a output => 11
        System.out.println("value after pre-increment = " + a); // output => 11
        System.out.println("value after pre-increment & by adding 1 = " + (a + 1)); // output =>12

        // 2. Post-Increment
        int b = 15;
        System.out.println("Pure value = " + b); // output => 15
        System.out.println("value during unary operation =  " + (b++)); //it later increments the value of b output => 15
        System.out.println("value after post-increment = " + b); // output =>16
        System.out.println("value after post-increment & by adding 1 = " + (b + 1)); // output =>17

        // Decrement
        // 1. Pre-Decrement
        int c = 20;
        System.out.println("Pure value = " + c); // output => 20
        System.out.println("value during unary operation =  " + (--c)); //it prior decrement the value of _02_Stream output => 19
        System.out.println("value after pre-decrement = " + c); // output => 19
        System.out.println("value after pre-decrement & by substracting 1 = " + (c - 1)); // output =>18

        // 2. Post-Decrement
        int d = 25;
        System.out.println("Pure value = " + d); // output => 25
        System.out.println("value during unary operation =  " + (d--)); //it later increments the value of d // output => 25
        System.out.println("value after post-decrement = " + d); // output => 24
        System.out.println("value after post-decrement & by substracting 1 = " + (d - 1)); // output => 23
    }
}
