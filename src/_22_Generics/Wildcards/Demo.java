package _22_Generics.Wildcards;

public class Demo {
    public static void main(String[] args) {
        // Invariant in generics
        //Animal animal = new Dog();
        // animal.eat();
        // animal.walk();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
//        animals[4] = new Animal();

        for(Animal animal : animals) {

            if(animal == null) {
                continue;
            }

            animal.eat();
        }

    }
}

class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

/*
    Array Covariance and Generic Invariance:
        1. Arrays in Java are Covariant.
        2. This means a Dog[] can be assigned to an Animal[] reference.
        3. Both references point to the same array.
        4. Since the actual array is Dog[], only Dog objects can be stored in it.
        5. Trying to store an Animal object causes ArrayStoreException at runtime.
        6. Java checks the actual array type at runtime for arrays.
        7. Generics are Invariant.
        8. List<Dog> cannot be assigned to List<Animal>.
        9. This restriction prevents storing the wrong type of object and provides type safety at compile time.

    Execution:
        1. Create a Dog array.
        2. Store its reference in an Animal[] variable.
        3. Add Dog objects successfully.
        4. Try to add an Animal object.
        5. JVM throws ArrayStoreException because the actual array type is Dog[].
*/