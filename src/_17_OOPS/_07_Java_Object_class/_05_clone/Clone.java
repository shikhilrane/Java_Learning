package _17_OOPS._07_Java_Object_class._05_clone;

public class Clone {
    public static void main(String[] args) {
        NewCar car1 = new NewCar("Honda", 2024);
        System.out.println(car1);
        NewCar car2 = car1.clone();
        System.out.println(car2);
    }
}

class NewCar implements Cloneable {
    private String brand;
    private int year;

    public NewCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public NewCar clone() {
        try {
            return (NewCar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
    Clone Notes:

    1. Cloneable is a marker interface (it has no methods).
    2. It tells JVM that this class allows cloning.
    3. clone() method is present in Object class.
    4. super.clone() creates a copy of the current object.
    5. super.clone() returns Object, so we type cast it to NewCar.
    6. If Cloneable is not implemented, super.clone() throws CloneNotSupportedException.
    7. The clone object has the same data but is a different object in memory.
    8. By default, super.clone() performs a shallow copy.
    9. Primitive values are copied directly, while reference variables copy only the reference.
    10. If deep copy is needed, we must clone the referenced objects manually.

    Execution:
        1. Create car1 object.
        2. Print car1.
        3. Call clone().
        4. super.clone() creates a copy of car1.
        5. Return the copied object as NewCar.
        6. Store it in car2.
        7. Print car2.
*/