package _17_OOPS._02_Class_and_Object._06_This_keyword._02_This_Program._02_This_Program._02_This_In_Complex_Number_Program;

public class ThisComplex {
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
        System.out.println(num1);                 // it will print reference of current object (reference of num1) (reference = unique identifier)
        System.out.println();
        
        System.out.println("Adding second and third complex numbers");
        Complex result = num2.add(num2,num3);
        result.print();
        System.out.println(num2);                 // it will print reference of current object (reference of num2) (reference = unique identifier)
        System.out.println();

        Complex res1 = num1.add(num1, num2, num3);
        res1.print();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}

class Complex{
    int a;                                          // made an int a
    int b;                                          // made an int b

    public Complex(int a, int b){
        this.a=a; // this.a = int a and a = value we gonna put in object constructor i.e. 2 or 4 or 3, so this.a = 2 or this.a = 4 or this.a = 3
        this.b=b; // this.b = int b and b = value we gonna put in object constructor i.e. 4 or 1 or 5, so this.b = 4 or this.b = 1 or this.b = 5
    }

    void print(){
        System.out.println(a + " + " + b + "i");
    }

    // applying 'this' in method, here current object is num1 (because we have applied add method on num1)
    Complex add(Complex num2){
        print();// it will call current object on which we have applied method (method called on current object i.e.num1) so in this case 2 + 4i
        this.print(); // it is as same as above, because we know this calls current object, here current object is num1
        num2.print(); // here we have called num2's print method
        System.out.println(this);   // it will print reference of current object (current object is num1) (reference = unique identifier)
        return new Complex(a+num2.a, b+num2.b);
    }

    // applying 'this' in method, here current object is num2 (because we have applied add method on num2)
    Complex add(Complex num2, Complex num3){
        print();// it will call current object on which we have applied method (method called on current object i.e.num2) so in this case 4 + 1i
        this.print(); // it is as same as above, because we know this calls current object, here current object is num2
        num3.print(); // here we have called num3's print method
        System.out.println(this);   // it will print reference of current object (current object is num2) (reference = unique identifier)
        return new Complex(num2.a+num3.a, num2.b+num3.b);
    }

    Complex add(Complex num1, Complex num2, Complex num3){
        print();
        this.print();
        num1.print();
        num2.print();
        num3.print();
        System.out.println(this);
        return new Complex(num1.a+num3.a, num1.b+num3.b);
    }
}