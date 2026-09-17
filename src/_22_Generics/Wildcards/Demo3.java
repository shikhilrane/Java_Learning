package _22_Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

// Wildcard with upper bound (extends )

public class Demo3 {
    public static void main(String[] args) {
        List<Doggg> dogs = new ArrayList<>();
        dogs.add(new Doggg());
        dogs.add(new Doggg());

        // List<Animalll> animals = new ArrayList<>();
        // animals.add(new Animalll());
        // animals.add(new Animalll());

        // List<Integer> l = new ArrayList<>();

        fun(dogs);
    }

    static void fun(List<? extends Animalll> values) {
         for(Animalll a : values) {
            a.eat();
         }

        //values.add(new Doggg());
    }
}

class Animalll {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Doggg extends Animalll {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animalll {

}

/*
    Upper Bounded Wildcard (? extends)
        1. ? extends Animal means Animal or any subclass of Animal.
        2. It can accept:
            - List<Animal>
            - List<Dog>
            - List<Cat>
        3. It cannot accept unrelated types like List<Integer>.
        4. Since every element is at least an Animal, we can safely read them as Animal.
        5. We cannot add elements because the actual subtype is unknown.
        6. This wildcard is mainly used when we only need to read data.

    Execution:
        1. Create a List<Dog>.
        2. Add Dog objects.
        3. Pass the list to fun().
        4. fun() accepts it because Dog extends Animal.
        5. Elements can be read as Animal.
        6. Adding new elements is not allowed.
*/