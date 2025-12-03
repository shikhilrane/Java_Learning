package _17_OOPS._06_Java_Memory;

public class Undertaningmemory {
    public static void main(String[] args) {                            // line 1 
        int i = 1;                                                      // line 2
        Object obj = new Object();                                      // line 3
        Undertaningmemory mem = new Undertaningmemory();                // line 4
        mem.foo(obj);                                                   // line 5
    }                                                                   // line 9

    private void foo(Object param){                                     // line 6
        String str = param.toString();                                  // line 7
        System.out.println(str);
    }                                                                   // line 8
}

/*
    line 1. Main Method
    line 2. local variable with primitive data type (integer 1)
    line 3. Made an object of Object class
    line 4. Made an Object of public class Undertaningmemory
    line 5. Executed object mem for method foo(obj)
    line 6. in method foo we passed Object 
    line 7. .toString() is method in Object class to convert object reference in human readable string
*/