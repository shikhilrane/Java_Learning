public class thisVsSuper {
    String name;
    void start(){
        Scooter bajaj = new Scooter();                      // Create an object of Scooter (passing a current object)
        bajaj.braking(this);                                // Pass the current object of thisVsSuper to the braking method
        System.out.println(this.name + " is running");
    }

    // // Print the name of the car from the passed object
    // thisVsSuper braking(){                                  // another method who returns object of thisVsSuper(returning a current object)
    //     System.out.println(braking());                      // Print that the current object is braking
    //     return this;                                        // Return the current object (this)
    // }

    public static void main(String[] args) {
        thisVsSuper car = new thisVsSuper();
        car.name = "i20";                                   // Set the name of the car
        System.out.println(car.name);                       // Print the name of the car
        car.start();                                        // Call the start method
    }
}

class Scooter {                                             // made a class 
    void braking (thisVsSuper useCase){                     // Method that receives a thisVsSuper object to print the name of the car
        System.out.println(useCase.name + " is braking");   // Print the name of the car from the passed object
    }
}

/*
    1. this is use to pass and return current object
    2. where as super cant be passed as well return current object
    execution :- 
        line number 16
        line number 17
        line number 18
        line number 19
        line number 3
        line number 4
        line number 5
        line number 25
        line number 6
 */