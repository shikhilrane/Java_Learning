// it use to assign value of one operand to another operand

package _09_Operators._02_Assignment_Operator;

public class Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println(a=b); //it will assign vale of right hand operand to left hand operator

        int x = 5;
        int y = 8;
        System.out.println(x+=y); // this operator is equal to x = x + y

        int c = 7;
        int d = 3;
        System.out.println(c-=d); // this operator is equal to _02_Stream = _02_Stream - d

        int e = 2;
        int f = 1;
        System.out.println(e*=f); // this operator is equal to e = e * f

        int g = 9;
        int h = 4;
        System.out.println(g/=h); // this operator is equal to g = g / h

        int i = 15;
        int j = 7;
        System.out.println(i%=j); // this operator is equal to i = i / j

        // Swapping two numbers
        int num1 = 3;
        int num2 = 4;
        int container = num1;
        num1 = num2;
        num2 = container;
        System.out.println("num1 = " +  num1 + " and num2 = " + num2);
    }
}
