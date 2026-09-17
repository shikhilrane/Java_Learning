package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._05_;

public class Demo5 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        //Vehicle.brake();
    }
}

// After Java 8 --> Default Methods, Static methods
// From Java 9 -> Private methods

// List Interface --> methods

// interface List {
//     default void pushBack() {

//     }
// }

interface Vehicle {
    default void drive() {
        System.out.println("Vehicle is driving");
        accelerate();
    }

    static void brake() {
        System.out.println("Vehicle is applying brake");
    }

    private void accelerate() {
        System.out.println("Vehicle is Accelerating");
    }
}

class Car implements Vehicle {
    // @Override
    // public void drive() {
    //     System.out.println("Car is driving");
    // }
}

/*
    Default, Static and Private Methods in Interface:
        1. Before Java 8, interfaces could have only abstract methods.
        2. Java 8 introduced:
            - default methods
            - static methods
        3. Java 9 introduced:
            - private methods
        4. A default method provides a method body and is inherited by implementing classes.
        5. An implementing class may override the default method if needed.
        6. A static method belongs to the interface and is called using the interface name.
        7. A private method can only be used inside the interface to reuse common logic.
        8. It cannot be accessed or overridden by implementing classes.

    Execution:
        1. Create a Car object.
        2. Store it in a Vehicle reference.
        3. Call drive().
        4. Since Car does not override drive(), Vehicle's default drive() is executed.
        5. drive() internally calls the private accelerate() method.
        6. Output:
            Vehicle is driving
            Vehicle is Accelerating
*/