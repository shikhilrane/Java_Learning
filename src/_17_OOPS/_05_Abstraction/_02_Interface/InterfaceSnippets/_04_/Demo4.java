package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._04_;

public class Demo4 {
    public static void main(String[] args) {

    }
}

// Interface inheritance
interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog {

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
}

/*
    Interface Inheritance Notes:
        1. One interface can inherit another interface using extends.
        2. Dog extends Animal, so Dog inherits eat().
        3. Dog also declares its own method bark().
        4. StreetDog implements Dog.
        5. Therefore, StreetDog must override:
            - eat() (inherited from Animal)
            - bark() (declared in Dog)
        6. Interface inheritance is achieved using extends.
        7. A class implements an interface using implements.

    Execution:
        1. Animal declares eat().
        2. Dog extends Animal and adds bark().
        3. StreetDog implements Dog.
        4. Override eat().
        5. Override bark().
*/