package _17_OOPS._02_Class_and_Object._05_Java_Constructors._02_Constructor_Code;

public class Constructor {
    public static void main(String[] args) {
        
        // 1. default constructor(here default constructor has worked as we havent pass any value for a & b so default constructor 0 as the value in such case)
        NullConstructor n1 = new NullConstructor();

        // 2. understanding default constructor (here we checked that even if we pass 0 values to constructors then it will show result same as null constructor)
        defaultConstructor d1 = new defaultConstructor();
        d1.add();
        
        // 3. Stating value of constructor inside class (here we have passed value for the constructor in class directly)(Non parameterised constructor)
        ValueAssignInClass v1 = new ValueAssignInClass();
        v1.multiply();

        // 4. Proper constructor (Parameterised Constructor)
        Complex firstConstructor = new Complex("Hey",4,6); // name="Hey", a=4, b=6
        firstConstructor.print();
        Complex secondConstructor = new Complex("Hello",8,9);
        secondConstructor.print();

        // 5. Constructor Overloading (Made 3 constructor's object)
        OverloadConstructor co1 = new OverloadConstructor(30);
        co1.substraction();
        OverloadConstructor co2 = new OverloadConstructor(20,5);
        co2.substraction();
        OverloadConstructor co3 = new OverloadConstructor("Successfully", 90, 5);
        co3.substraction();

        // 6. Copy Constructor
        Car myCar = new Car("Tesla Model S");
        System.out.println("Car model: " + myCar.model);
    }
}

// 1. Default Constructor
class NullConstructor{
    int a;
    int b;
    public NullConstructor(){
        System.out.println(a+b);    
    }
}

// 2. understanding Default Constructor
class defaultConstructor{
    int x;
    int y;

    public defaultConstructor(){
        x = 0;
        y = 0;
    }

    void add(){
        System.out.println(x+y);
    }
}

// 3. Stating value of constructor inside class (overriding default constructor) (Non parameterised constructor)
class ValueAssignInClass{
    int n;
    int m;

    public ValueAssignInClass(){
        n = 10;
        m = 4;
    }

    void multiply(){
        System.out.println(n*m);
    }
}

// 4. Proper constructor (Parameterised Constructor)
class Complex{
    String name;
    int a, b;

    public Complex(String constructorName, int num1, int num2){ // created constructor, passed parameter to accept values at object
        name = constructorName;                                 // then assign those values from object given by user to varialble
        a = num1;
        b = num2;
    }

    void print(){
        System.out.println(name + " " + a + " + " + b + "i");
    }
}

// 5. Constructor Overloading (made multiple constructors like we do method overloading)
class OverloadConstructor{
    String s;
    int c;
    int d;

    public OverloadConstructor(int n1){
        c = n1;
        d = 10;
    }
    public OverloadConstructor(int n1, int n2){
        c = n1;
        d = n2;
    }
    public OverloadConstructor(String str, int n1, int n2){
        s = str;
        c = n1;
        d = n2;
    }

    void substraction(){
        System.out.println(s + " " + c/d);
    }
}

// 6. Copy Constructor (It will create a new object by copying another)
class Car {
    String model;
    public Car(String model) {
        this.model = model;
    }
}