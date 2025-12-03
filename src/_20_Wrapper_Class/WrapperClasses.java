package _20_Wrapper_Class;

public class WrapperClasses {
    public static void main(String[] args) {
        // Method 1
        // Integer obj1 = new Integer(20);              // 1 (Deprecated since Java 9)


        // Method 2
        Integer obj2 = Integer.valueOf(30);           // 2
        System.out.println(obj2);

        String str = "35";
        Integer obj22 = Integer.valueOf(str);           // 3
        System.out.println(obj22);

        String myStr = "true";
        Boolean obj222 = Boolean.valueOf(myStr);        // 4
        System.out.println(obj222);


        // Method 3
        Integer obj3 = 40;                              // 5
        System.out.println(obj3);   // autoboxing

        // Unboxing
        int a = obj3;                                   // 7
        System.out.println(a);      // unboxing
    }
}

/*
    1. First method - This is a first method in which we use object creation method to convert int primitive data type to 
       Object data type (i.e int to Integer), Integer objectName = new Integer(); but this method is depricated.
    2. Second method - In which we use value of method to use primitive data type to object data type, i.e. int to Integer
       Integer ObjectName = Integer valueOf();
    3. It is also a second type of method, here we can convert StringClass type of number into Integer with the help of valueOf();
    4. It is also a second type of method, here we can convert StringClass type of boolean into Boolean with help of valueOf();
    5. It is also a third type of method, here we directly convert primitive data type to object data type i.e. int to Integer
       Integer objectName = number;
    6. All this type of converting from primitive data type to object data type is called Autoboxing
    7. Conversion from Object data type to primitive data type is called as Unboxing
*/