package _17_OOPS._08_Polymorphysm._01_Run_time_Polymorphysm_override._03_Non_overriden_Polymorphysm_Downcasting;

public class NonOverriden {
    public static void main(String[] args) {
        Data d = new ChildData();   // 6  // upcasting, ParentClass objectName = new ChildClass();
        d.i = 5;                    // 7
        d.print();                  // 8
        // d.run();                 // 9

        ChildData cd = (ChildData) d;   // 10    downcasting, ChildClass objectName = new ChildClass();
        cd.run();                       // 11

        // 12
        double dn = 5.5;
        int a = (int) dn;
        System.out.println(a); 
    }    
}

class Data {                    // 1
    int i;                      // 2
    public void print(){        // 3
        System.out.println(i);
    }
}

class ChildData extends Data{   // 4
    public void run(){          // 5
        System.out.println("Run data " + i);
    }
}

/*
    1 Made a class Data
    2 add variable in it;
    3 made a method print();
    4 Made a class ChildData and made this class, a subclass of class Data (extended)
    5 made a method run(); (own method of child class)
    6 Made a object of Data in which we passed ChildData (this is called upcasting)
    7 even if we pass or not value for i it will onlyexecute method of class data
    8 It will execute method of class Data (parent class) because print method is only present in class Data
    9 Even if we try to run method of child class then it won't work
   10 so if we want to use different method that is present in child class but not present in parent class then we have to cast 
      cast object like this as we seen in datatype casting
      Syntax - ChildClassName objectNameForChildClass = (ChildClassName) objectNameOfParentClass
   11 Then we can run method of child class
   12 class object type cast is similar to data type cast

 */