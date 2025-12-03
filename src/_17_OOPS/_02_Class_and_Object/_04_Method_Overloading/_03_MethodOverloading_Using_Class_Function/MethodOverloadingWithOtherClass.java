package _17_OOPS._02_Class_and_Object._04_Method_Overloading._03_MethodOverloading_Using_Class_Function;

// Method Overloading for different classes

public class MethodOverloadingWithOtherClass {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Shikhil");
        obj.greeting("Shikhil", 5);
    }   
}

class Greet{
    void greeting(){                                // same method name but it doesnt have parameter
        System.out.println("hello");
    }
    void greeting(String name){                     // same method name but it has StringClass as a parameter
        System.out.println("Hello! " + name);
    }
    void greeting(String name, int count){          // StringClass and int same name method
        for (int i = 0; i < count; i++) {
            System.out.println("Hello! " + name);
        }
    }
}