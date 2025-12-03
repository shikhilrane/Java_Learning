package _17_OOPS._07_Java_Object_class._03_hashCode;

public class LearnHashcode {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2023);    // 9
        Car c2 = new Car("Honda", 2023);    // 10
        System.out.println(c1.hashCode());  // 11
        System.out.println(c2.hashCode());  // 12
        System.out.println(c1.equals(c2));  // 14
    }
}

class Car {
    String model;
    int year;
    public Car(String model, int year){     // 1
        this.model = model;                 // 2
        this.year = year;                   // 3
    }

    public boolean equals(Object anotherObj){   // 13
        Car objEqual = (Car)anotherObj;
        if (this.model.equals(objEqual.model) && this.year==objEqual.year) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){                  // 4
        int initialNumber = 31;             // 5
        initialNumber += year;              // 6
        initialNumber += model.hashCode();  // 7
        return initialNumber;               // 8
    }
}

/*
    1 Made a constructor
    2 passed a value for model in constructor
    3 passed a value for year in constructor
    4 made a method for hashCode(); (which is present in Object class)
    5 we passes a random initial number in it
    6 add year (int) in it
    7 add hashcode of model (becsue to model is StringClass and so made took hashcode of model and add it)
    8 returned the initial number
    9 made object for class Car c1
   10 made object for class Car c2
   11 Printed hascode for c1
   12 Printed hascode for c2
   13 made a equals method to compare value of both objects of constructor because hashCode and equality must be same of two 
      different objects
   14 checked if two values are same or not
*/