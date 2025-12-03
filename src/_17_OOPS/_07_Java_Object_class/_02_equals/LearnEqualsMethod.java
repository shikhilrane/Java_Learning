package _17_OOPS._07_Java_Object_class._02_equals;

public class LearnEqualsMethod {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2023);    // 7
        Car c2 = new Car("Honda", 2023);    // 8
        System.out.println(c1);             // 9
        System.out.println(c2);             // 10
        System.out.println(c1.equals(c2));  // 11

        System.out.println(c1==c2);         // 12
    }    
}

class Car {
    String model;
    int year;
    public Car(String model, int year){     // 1
        this.model = model;                 // 2
        this.year = year;                   // 3
    }

    @Override
    public boolean equals(Object anotherObj){   // 4
        Car objEqual = (Car)anotherObj;         // 5 
        if (this.model.equals(objEqual.model) && this.year==objEqual.year) {    // 6
            return true;
        }
        return false;
    }
}

/*
    1 Made a constructor
    2 passed a value for model in constructor
    3 passed a value for year in constructor
    4 Made a method, in which we passes an object
    5 we casted data to access data for object c2 (refer polymorphism to learn casting)
    6 this.model.equals(objEqual.model) checks if the model of c1 is the same as c2's model: Both c1.model and c2.model are 
      "Honda", so this is true.
      this.year == objEqual.year checks if the year of c1 is the same as c2's year: Both c1.year and c2.year are 2023, so this is also true.
      we used equals to compare StringClass model, because there is equals method to compare strings in java object class to compare strings.
    7 A new Car object C1 is created with the model "Honda" and the year 2023 as value for constructor
    8 A new Car object C2 is created with the model "Honda" and the year 2023 as value for constructor
    9 Printed value, for constructor for c1
   10 Printed value, for constructor for c2
   11 Checked if values for both constructor is same or not, It will print true as equals(); method compare values (we checked 
      it in equals method in Car class) of object
   12 It checks values for object reference, it is different
*/