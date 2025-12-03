package _17_OOPS._02_Class_and_Object._06_This_keyword._02_This_Program._01_Adding_Complex_Number;

public class ComplexAdd {
    public static void main(String[] args) {
        Complex num1 = new Complex(2, 4);
        num1.print();
        Complex num2 = new Complex(4, 1);
        num2.print();
        Complex num3 = new Complex(3, 5);
        num3.print();

        System.out.println("Adding first two complex numbers");
        Complex res = num1.add(num2);
        res.print();

        System.out.println("Adding second and third complex numbers");
        Complex result = num2.add(num2,num3);
        result.print();

        System.out.println("Adding all complex numbers");
        Complex allResult = num1.add(num1,num2,num3);
        allResult.print();
    }
}

class Complex{
    int a;                                          // made an int a
    int b;                                          // made an int b

    public Complex(int real, int imaginary){        // made a constructor to pass value in int a and int b
        a=real;                                     // when we put the first number in Object constructor that will assign to int a
        b=imaginary;                                // when we put second number in Object constructor that will assign to int b
    }

    void print(){                                   // wrote a method to print complex numbers using above a and b
        System.out.println(a + " + " + b + "i");    // it will print a+bi
    }

    // we have applied add method on num1
    Complex add(Complex num2){                      // made method add who returns Complex number and passed parameter as num2
        return new Complex(a+num2.a, b+num2.b);     // return new complex number, a = 2, num2.a = 4, b = 4, num2.b = 1 (here we represented 
    }                                               // num2.a = 4 and num2.b = 1 because it reckons the value of a and b that set for first object
                                                    // so forcefully we have to tell to look for num2's a value and num2's b value

    // we have applied add method on num2
    Complex add(Complex num2, Complex num3){        // this is how we can add other objects complex values
        return new Complex(num2.a+num3.a, num2.b+num3.b);   // num2.a = 4, num3.a = 3, num2.b = 1, num3.b = 5
    }

    // we have applied add method on num1 to add all complex numbers
    Complex add(Complex num1, Complex num2, Complex num3){   // this is how we can add all the complex values
        return new Complex(num1.a+num2.a+num3.a, num1.b+num2.b+num3.b);// num1.a = 2,num2.a = 4, num3.a = 3, num1.b = 4,num2.b = 1, num3.b = 5
    }

}