package _17_OOPS._02_Class_and_Object._04_Method_Overloading._02_Method_Overloading_Different_Type_of_Datatype_as_Parameter;

public class MethodOverloadingDatatype {
    public static void main(String[] args) {
        float mod = dataTypeParameters(4.4f,6.5f);
        System.out.println(mod);
    }
    public static int dataTypeParameters(int a, int b){
        return a+b;
    }
    public static float dataTypeParameters(float a, float b){
        return a+b;
    }
    public static long dataTypeParameters(long a, long b){
        return a+b;
    }
}

// here, when we passed 2 arguments, it excuted 2nd function who has 2 float value, if we have put integer value then it would have executed 1st function who has 2 int values.