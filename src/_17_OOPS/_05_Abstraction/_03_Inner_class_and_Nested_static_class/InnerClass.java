package _17_OOPS._05_Abstraction._03_Inner_class_and_Nested_static_class;

public class InnerClass {
    class Toy{
        int price;
    }

    public static void main(String[] args) {
        // to access inner class Toy, we need to make an object of its upper class so,
        InnerClass obj = new InnerClass();  // made an object of upper class
        Toy t1 = obj.new Toy();             // then from it, we make an object of inner class
        t1.price = 50;
        System.out.println(t1.price);
    }
}


/*
    1. Here inner class Toy is non-static class, and as we know, to make object of non-static class in static class (main class 
       is static class) we have to make object of the class.
    2. But class Toy is inner class of class InnerClass so first we have to make object for outerclass class of class Toy
    3. so we made first, object of class InnerClass. (line number 8)
    4. then from that object we made object of class Toy. (line number 9)
 */