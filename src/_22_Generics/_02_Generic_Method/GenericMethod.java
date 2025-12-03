package _22_Generics._02_Generic_Method;

public class GenericMethod {
    public static void main(String[] args) {
        printData("hello");                            // 3
        printData(123);                                // 4
        printData(true);                               // 5

        GenericMethod obj = new GenericMethod();            // 8
        obj.doubleData(230);                           // 9
        obj.doubleData("It is a string");              // 10

        CustomClass custom = new CustomClass();             // 14
        obj.doubleData(custom.printClass());                // 15

        GenericMethod object = new GenericMethod();         // 18
        object.numberClass(546);                      // 19
        object.numberClass(32.53);                    // 20
//         object.numberClass("string not supported");     // 21
    }

    static <E> void printData(E data){                     // 1
        System.out.println(data);                          // 2
    }

    <F> void doubleData (F data){                          // 6
        System.out.println(data);                          // 7
    }

    <V extends Number> void numberClass(V data){           // 16
        System.out.println(data);                          // 17
    }
}

class CustomClass{                                          // 11
    String printClass(){                                    // 12
       return "This is custom class";                       // 13
    }
}

/*
    1. created a static method and like we did in generic class, we won't specify data type, we just specify a capital letter/s
    2. this method will print parameter
    3. When we pass StringClass, it will let us execute StringClass
    4. When we pass Integer, it will let us execute Integer
    5. When we pass Boolean, it will let us execute Boolean
    6. created a non-static method and passed generic type of data type as last method
    7. this method will print parameter
    8. as this is a non-static method we have to create an object its class thats why we created object
    9. When we pass Integer, it will let us execute Integer
   10. When we pass StringClass, it will let us execute StringClass.
   11. Created a class CustomClass
   12. created a method in CustomClass that will return StringClass
   13. returned StringClass
   14. Made a object of class CustomClass
   15. Passed that object as doubleData's parameter. so it will print StringClass inside printClass()
   16. Created a non-static method and extended it's generic variable name to Number class present in java.lang package
   17. It will print data
   18. as this is a non-static method we have to create an object its class thats why we created object (it is called bounded as
       generics).
   19. When we pass Integer, it will let us execute Integer
   20. When we pass double, it will let us execute double.
   21. When we pass StringClass, it will not let us execute StringClass because in method creation we have extended this method to Number
       class so it will only let us execute number data
*/