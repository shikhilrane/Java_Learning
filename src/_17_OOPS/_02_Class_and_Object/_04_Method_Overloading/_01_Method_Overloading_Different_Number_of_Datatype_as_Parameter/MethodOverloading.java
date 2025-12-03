package _17_OOPS._02_Class_and_Object._04_Method_Overloading._01_Method_Overloading_Different_Number_of_Datatype_as_Parameter;

public class MethodOverloading {
    public static void main(String[] args) {
        int mo = numberParameter(3, 5, 7);
        System.out.println(mo);
    }
    public static int numberParameter(int a, int b){                    // 2 times same type of data type for parameters
        return a+b;
    }
    public static int numberParameter(int a, int b, int c){             // 3 times same type of data type for parameters 
        return a+b+c;
    }
    public static int numberParameter(int a, int b, int c, int d){      // 4 times same type of data type for parameters 
        return a+b+c+d;
    }

    // Greet obj = new MethodOverloading();
}

// here, when we passed 3 arguments, it executed second function & if in case we passed 4 parameters it would have executed third function.