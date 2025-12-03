package _17_OOPS._06_Java_Memory;

public class DataReferencing {
    public static void main(String[] args) {

        // local variable change value execution
        int a = 5;                              // 1
        changeValue(a);                         // 3
        System.out.println(a);                  // 4

        // Object variable change value execution
        Data obj = new Data();                  // 6
        obj.data = 20;                          // 7
        changeValue(obj);                       // 9
        System.out.println(obj.data);           // 10
    }
    static void changeValue(int a){             // 2
        a = 10;
    }

    static void changeValue(Data obj){          // 8
        obj.data = 100;
    }
}

class Data {                                    // 5
    int data;
    float pointData;
}

/*
    1 created a variable with value 5
    2 created a static method in which we passed parameter a and give it value 10.
    3 called a method to change the value of a
    4 took output, but it doesn't change.
      Output : but still we got the result as 5 because int a = 5 is in stack memory, so the value of a i.e. 5 is in stack memory too because the primitive type of data is stored in stack memory

    To change value we have to make class and pass that class's object then that can be changed because it will get stored in heap memory as object and there can be 2 references for 1 object
    5 created class Data and passed int data in it
    6 created object for class Data
    7 assign value to variable data
    8 created a method to change value of data, and assign it value 100
    9 called a method
   10 took output, this time it changed because object reference can refer to other values in heap memory as well
      it is useful to solve problems
 */