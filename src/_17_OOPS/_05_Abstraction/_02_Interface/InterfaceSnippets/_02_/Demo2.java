package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._02_;

public class Demo2 {
    public static void main(String[] args) {
        // MathConstant r1 = new Random();
        // r1.fun();

        System.out.println(MathConstant.PI_VALUE);
    }
}

// Variables inside interfaces

interface MathConstant {
    double PI_VALUE = 3.14;
    int VALUE = 10;

    //void fun();
}

class Random implements MathConstant {
    // @Override
    // public void fun() {
    //     System.out.println(PI_VALUE);
    // }
}

/*
    Interface Variables Notes:
        1. All variables inside an interface are implicitly:
            - public
            - static
            - final
        2. So writing:
                double PI_VALUE = 3.14;
           is internally treated as:
                public static final double PI_VALUE = 3.14;
        3. Since variables are static, they belong to the interface, not to an object.
        4. Since variables are final, their values cannot be changed.
        5. Interface variables are accessed using the interface name.

    Execution:
        1. Access PI_VALUE using MathConstant.PI_VALUE.
        2. Print its value.
        3. Output: 3.14
*/