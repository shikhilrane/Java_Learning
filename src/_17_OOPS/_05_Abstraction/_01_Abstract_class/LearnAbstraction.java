package _17_OOPS._05_Abstraction._01_Abstract_class;

public class LearnAbstraction {
    public static void main(String[] args) {
        System.out.println("Car");
        Car c1 = new Car();             // made object of subclass Car
        c1.name = "Mercedes";
        System.out.println(c1.name);
        c1.typeOfVehicle("Car");
        c1.accelerate();
        c1.wheels(4);
        // System.out.println(Vehicle.maximumObject);
        // Vehicle.maximumObject = 20;                      // we can't update value of variable here because it is by default
                                                            // 'public static final'
        // System.out.println(Vehicle.maximumObject);
        System.out.println();

        System.out.println("Truck");
        Truck t1 = new Truck();         // made object of subclass Car
        t1.name = "Tata";
        System.out.println(t1.name);
        c1.typeOfVehicle("Truck");
        t1.accelerate();
        t1.wheels(4);
        System.out.println();

        System.out.println("Bike");
        Bike b1 = new Bike();           // made object of subclass Car
        b1.name = "Royal Enfield";
        System.out.println(b1.name);
        c1.typeOfVehicle("Bike");
        b1.accelerate();
        b1.wheels(2);

    }
}

abstract class Vehicle{                 // Abstract class (By using this conceptual class, we can make as many of the subclasses by using data of abstract class, by making abstract class as parent class of other class as it can inherit all the methods and properties to its child class)
    int maximumObject= 12;              // it is same as, 'public static final int maximumObject= 12;' every variable is  
                                        // 'public static final' 
    String name;                        // we can use normal variable in abstract class but can't make normal variable abstract
    void typeOfVehicle(String vehicleType){  // it is called a concrete method, we dont need to add this to subclass as it will directly execute in an object
        System.out.println("it is " + vehicleType);
    }
    abstract void accelerate();         // we have to make methods as abstract as well (we can't make abstract method as static)
    abstract void wheels(int wheels);   // we have to make methods as abstract as well (we can't make abstract method as static)
}


class Car extends Vehicle{              // we made this class subclass of abstract Vehicle to inherit Vehicle class property
    @Override                           // Override means this method is extracted from its parent class
    void accelerate() {                 // we have to add all abstract methods of abstract class in this subclass
        System.out.println(name + " car is accelerating");
    }

    @Override
    void wheels(int numberOfWheels) {   // we have to add all abstract methods of abstract class in this subclass
        System.out.println("there are " + numberOfWheels +" wheels in the car");
    }
}

class Truck extends Vehicle{            // we made another class subclass of abstract Vehicle to inherit Vehicle class property
    @Override
    void accelerate() {                 // we have to add all abstract methods of abstract class in this subclass
        System.out.println(name +  " truck is accelerating");
    }

    @Override
    void wheels(int numberOfWheels) {   // we have to add all abstract methods of abstract class in this subclass
        System.out.println("there are " + numberOfWheels +" wheels in the truck");
    }
}

class Bike extends Vehicle{             // we made another class subclass of abstract Vehicle to inherit Vehicle class property
    @Override
    void accelerate() {                 // we have to add all abstract methods of abstract class in this subclass
        System.out.println( name + " Bike is accelerating");
    }

    @Override
    void wheels(int numberOfWheels) {   // we have to add all abstract methods of abstract class in this subclass
        System.out.println("there are " + numberOfWheels +" wheels in the bike");
    }
}