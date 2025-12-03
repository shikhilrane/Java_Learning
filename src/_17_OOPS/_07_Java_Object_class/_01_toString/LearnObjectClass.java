package _17_OOPS._07_Java_Object_class._01_toString;

public class LearnObjectClass {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2023);    // 7
        System.out.println(c1);                         // 8
    }
}

class Car {
    String model;
    int year;
    public Car(String model, int year){ // 1
        this.model = model;             // 2
        this.year = year;               // 3
    }

    @Override                   // 4
    public String toString (){  // 5
        return "Car model is " + model + " and year is " + year;    // 6
    }
}

/*
    1 Made a constructor
    2 passed a value for model in constructor
    3 passed a value for year in constructor
    4 We Override a method of Object class (toString() is present in Object class)
    5 toString() is use to convert Object reference to human-readable form that will be returned in StringClass
    6 returned Object reference in StringClass particular object
    7 created object to and passed values in its constructor
    8 took output
*/