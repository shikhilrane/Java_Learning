package _17_OOPS._05_Abstraction._02_Interface;

public class LearnInterfaces {
    public static void main(String[] args) {
        AllTogether c1 = new AllTogether();     // Made an object of class AllTogether

        c1.nameOfBird = "Pigeon";               // accessed properties and methods of interface Bird
        c1.fly();
        c1.heightOfFlying(20.48f);
        c1.Sleeping();
        System.out.println("There are "+ Bird.legs + " legs of " + c1.nameOfBird);
//      Bird.legs = 3; // we can't update final value

        System.out.println();

        c1.nameOfAnimal = "Leopard";            // accessed properties and methods of interface Bird
        c1.run();
        c1.speedOfAnimal(180);
        c1.Sleeping(c1.nameOfBird, c1.nameOfAnimal);
        System.out.println("There are "+ Animal.legs + " legs of " + c1.nameOfAnimal);
    }
}

interface Bird{             // this is how the interface is made
    // StringClass nameOfBird = "Crow";  // we can even add name like this
    int legs = 2;           // it is as same as, public static final int legs = 2, because every property in interface is 'public static final' by default it cant be updated in the main method even don't require creating an object.
    void fly();             // we can add method like this (This must be empty as interface is just imagination)
    void heightOfFlying(float height); //we can add method like this as well(This must be empty as interface is just imagination)
    void Sleeping();        // sleeping method same method as in interface Animal (This must be empty as interface is just imagination)
    default void stays(){   // it is a default method, we need to use default keyword in interface if we want to apply this method only for this interface
        System.out.println("It generally stays on trees");
    }

    void Sleeping(String nameOfBird, String nameOfAnimal);
}
interface Animal{           // this is how the interface is made
    int legs = 4;           // it is as same as, public static final int legs = 2, because every property in interface is 'public static final' by default it cant be updated in the main method even don't require creating an object.
    void run();             // we can add method like this (This must be empty as interface is just imagination)
    void speedOfAnimal(int speed);  // we can add method like this as well (This must be empty as interface is just imagination)
    void Sleeping();        // sleeping method same method as in interface Bird, so method overloading will happen here(This must be empty as interface is just imagination)
}

class AllTogether implements Bird, Animal{      // here, a single subclass can inherit multiple parent class if parents are interface by using 'implements' keyword

    String nameOfBird;                          // this is how we can set things here, as we set name for interface Bird
    void birdName(String nameOfBird){
        this.nameOfBird = nameOfBird;
    }

    String nameOfAnimal;                        // this is how we can set things here, as we set name for interface Animal
    void animalName(String nameOfAnimal){
        this.nameOfAnimal = nameOfAnimal;
    }

    @Override
    public void fly() {                         // used void fly(); method from interface Bird
        System.out.println(nameOfBird + " is flying.");
    }

    @Override
    public void heightOfFlying(float height) {  // used void heightOfFlying(); method from interface Bird
        System.out.println(nameOfBird + " is flying at height " + height + " meters.");
    }

    @Override
    public void Sleeping() {                    // used void sleeping(); method from interface Bird
        System.out.println(nameOfBird + " is sleeping");
    }

    @Override
    public void run() {                         // used void run(); method from interface Animal
        System.out.println(nameOfAnimal + " is running.");
    }

    @Override
    public void speedOfAnimal(int speed) {      // used void speedOfAnimal(); method from interface Animal
        System.out.println(nameOfAnimal + " is running at speed of " + speed + " kms.");
    }

    @Override
    public void Sleeping(String nameOfBird, String nameOfAnimal) {  // here method overloading happened because void sleeping() was even present in interface Bird so that's why we took 2 parameters because for interface Bird sleeping parameter is also used with the same number of parameters
        System.out.println(nameOfAnimal + " is sleeping");
    }
}