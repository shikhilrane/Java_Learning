package _17_OOPS._02_Class_and_Object._02_Creating_class_and_object;

public class CreatingClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bruno";
        d1.age = 4;
        d1.color = "White";
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        d1.walk();
        d1.bark();

        Dog d2 = new Dog();
        String dogName = d2.name="Leao";
        int dogAge = d2.age = 3;
        String dogColor = d2.color = "Black";
        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(d2.color);
        d2.walk();
        d2.bark();

        Car bmw = new Car();
        bmw.name = "BMW Series 5";
        bmw.color = "Black";
        bmw.price = 50;
        bmw.height = 2.8f;
        bmw.length = 8.12f;
        bmw.functionsOfCar();
        bmw.color = "Grey";
        bmw.functionsOfCar();

        Complex num1 = new Complex();
        num1.a=3;
        num1.b=4;
        num1.print();

        Pen finegrip = new Pen();
        finegrip.setColor("blue");
        finegrip.setTip(5);
        System.out.println(finegrip.color);
        System.out.println(finegrip.tip);
        finegrip.setColor("Purple");
        finegrip.setTip(4);
        System.out.println(finegrip.color);
        System.out.println(finegrip.tip);
        finegrip.color = "pink";
        finegrip.tip = 6;
        System.out.println(finegrip.color);
        System.out.println(finegrip.tip);

        BankAccount user1 = new BankAccount();
        user1.username = "Shikhil";
        System.out.println(user1.username);
        user1.changePassword("efgh");
        // System.out.println(user1.password);
    }
}

class Dog{
    String name;
    int age;
    String color;
    void walk(){
        System.out.println(name + " can walk and he is " + age + " years old and " + color + " in color");
    }
    void bark(){
        System.out.println(name + " can bark");
    }
}

class Car {
    String name;
    String color;
    int price;
    float length;
    float height;
    void functionsOfCar(){
        System.out.println(name + " is " + color + " in color and has price " + price + " lacs with height " + height + " meters and length " + length + " meters");
    }
}

class Complex{
    int a, b;
    void print(){
        System.out.println(a + " + " + b + "i");
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String penColor){
        color = penColor;
    }
    void setTip(int penTip){
        tip = penTip;
    }
}

class BankAccount{
    public String username;
    private String password;
    void changePassword(String pwd){
        password = pwd;
    }
}