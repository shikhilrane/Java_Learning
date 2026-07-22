package _17_OOPS._07_Java_Object_class._04_getClass;

public class LearnGetclass {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName()); // _17_OOPS._07_Java_Object_class._04_getClass.Animal
        System.out.println(d.getClass().getName()); // _17_OOPS._07_Java_Object_class._04_getClass.Dog

        System.out.println(a instanceof Dog);       // a is not an instance of Dog
        System.out.println(a instanceof Animal);    // a is an instance of Animal
        System.out.println(d instanceof Dog);       // d is an instance of Dog
        System.out.println(d instanceof Animal);    // d is an instance of Animal
    }
}

class Animal {

}

class Dog extends Animal {

}