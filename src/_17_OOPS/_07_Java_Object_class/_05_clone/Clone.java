package _17_OOPS._07_Java_Object_class._05_clone;

public class Clone {
    public static void main(String[] args) {
        NewCar car1 = new NewCar("Honda", 2024);
        System.out.println(car1);
        NewCar car2 = car1.clone();
        System.out.println(car2);
    }
}

class NewCar implements Cloneable {
    private String brand;
    private int year;

    public NewCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public NewCar clone() {
        try {
            return (NewCar) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
