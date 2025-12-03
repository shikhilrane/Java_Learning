package _17_OOPS._03_Inheritance._02_Understanding_Inheritance;// this is child class or sub class

public class Carr extends Vehiclee {            // we have to add extends and name of parent class to make this subclass
    public static void main(String[] args) {
        Carr obj1 = new Carr();                 // it made object from its parent's class
        obj1.name = "Scorpio";
        System.out.println(obj1.name);
        obj1.price = 1200000;
        System.out.println(obj1.price);
        obj1.print();
    }    
}
