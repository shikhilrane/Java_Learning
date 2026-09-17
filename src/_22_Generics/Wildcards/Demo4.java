package _22_Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

// Generics with Lower bound (super)

public class Demo4 {
    public static void main(String[] args) {
        List<Animallll> animals = new ArrayList<>();
        animals.add(new Animallll());
        animals.add(new Animallll());

        fun(animals);
    }

    public static void fun(List<? super Animallll> values) {
        // writing
        values.add(new Animallll());
        values.add(new Dogggg());
        values.add(new Catt());
        values.add(new Labrador());

        // Reading
        for(Object obj : values) {
            Animallll a = (Animallll) obj;
            a.eat();
        }

    }
}

class Animallll {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dogggg extends Animallll {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class Labrador extends Dogggg {

}

class Catt extends Animallll {

}

/*
    Lower Bounded Wildcard (? super)
        1. ? super Animal means Animal or any superclass of Animal.
        2. It can accept:
            - List<Animal>
            - List<Object>
        3. It cannot accept:
            - List<Dog>
            - List<Cat>
        4. Since the list can store Animal objects, we can safely add:
            - Animal
            - Dog
            - Cat
            - Labrador
        5. When reading, elements are returned as Object because the actual type may be Animal or Object.
        6. If needed, we must type cast Object to Animal.
        7. This wildcard is mainly used when we need to write data into the list.

    Execution:
        1. Create a List<Animal>.
        2. Pass it to fun().
        3. Add Animal and its subclasses to the list.
        4. Read each element as Object.
        5. Type cast it to Animal.
        6. Call eat().

    NOTE:
        1. Upper bounded wildcard (? extends) is used when we want to read objects of a specific type or its subclasses.
        2. Lower bounded wildcard (? super) is used when we want to add objects of a specific type or its subclasses.
        3. ? extends is mainly used for reading, while ? super is mainly used for writing.
        4. Use ? extends when you only need to read data.
           Use ? super when you need to add data.
        5. Wildcards can be used with generic types such as List, Set, Map, Queue, etc.
        6. Generics break the parent-child relationship (they are invariant).
           Therefore, List<Dog> cannot be treated as List<Animal>.
           To work with parent-child relationships in generics, we use wildcards (?, ? extends, ? super).
*/