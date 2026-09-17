package _22_Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Dogg> dogs = new ArrayList<>();
        dogs.add(new Dogg());
        dogs.add(new Dogg());

        fun(dogs);

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());

        // fun(animals);
    }

    // static void fun(List<Animal> animals) {
    //     for(Animal animal : animals) {
    //         animal.eat();
    //     }
    // }

    static void fun(List<?> values) {
        // for(Object obj : values) {
        //     System.out.println(obj.getClass().getName());
        // }
        //values.add(new Dog()); // wrong

        Object obj = values.get(0);
        Animall a = (Animall) obj;
        System.out.println(obj.getClass().getName());
    }
}

class Animall {
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}

class Dogg extends Animall {
    void bark() {
        System.out.println("Barking");
    }
}

/*
    Wildcard (?) in Generics:
        1. ? is called an Unbounded Wildcard.
        2. It means the method can accept a List of any type.
        3. List<?> can accept:
            - List<Dog>
            - List<Animal>
            - List<String>
            - List<Integer>
            etc.
        4. Since the actual type is unknown, we cannot add elements to List<?>.
        5. We can safely read elements from List<?>.
        6. Elements are returned as Object because the actual type is unknown.
        7. If needed, we can type cast the Object to its actual type.

    Execution:
        1. Create a List<Dog>.
        2. Add Dog objects.
        3. Pass the list to fun().
        4. fun() accepts it because of List<?>.
        5. Read the first element as Object.
        6. Type cast it to Animal.
        7. Print the runtime class name.
*/