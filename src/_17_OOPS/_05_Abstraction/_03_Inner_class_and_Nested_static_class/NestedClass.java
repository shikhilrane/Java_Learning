package _17_OOPS._05_Abstraction._03_Inner_class_and_Nested_static_class;

public class NestedClass {
    static class Playstation{
        int price;
    }

    public static void main(String[] args) {
        Playstation ps = new NestedClass.Playstation();     // we dont have to make object of NestedClass as playstation is static class
        ps.price = 500000;
        System.out.println(ps.price);

        // P1.i = 45;
        // System.out.println(P1.i);
    }
}

// static class P1{
//     int i;
//     void value(int i){
//         this.i = i;
//     }
// }

/*
    1. here class Playstation is static class, and we can directly make Object with respect to its outerclass
    2. so we directly made an object with respect to its non-static outer class. (line number 7)

    NOTE : we can't make class static as outer class because we can't make object of static class
 */
