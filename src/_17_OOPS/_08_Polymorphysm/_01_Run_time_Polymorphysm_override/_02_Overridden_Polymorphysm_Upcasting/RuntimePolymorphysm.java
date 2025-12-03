package _17_OOPS._08_Polymorphysm._01_Run_time_Polymorphysm_override._02_Overridden_Polymorphysm_Upcasting;

public class RuntimePolymorphysm {
    public static void main(String[] args) {
        Data d = new ChildData();       // 6 // upcasting, ParentClass objectName = new ChildClass();
        d.i = 5;                        // 7
        d.print();                   // 8
    }
}

class Data {                    // 1
    int i;                      // 2
    public void print(){        // 3
        System.out.println(i);
    }
}

class ChildData extends Data{   // 4
    @Override   
    public void print(){        // 5
        System.out.println("Override data " + i);
    }
}

/*
    1 Made a class Data
    2 add variable in it;
    3 made a method print();
    4 Made a class ChildData and made this class, a subclass of class Data (extended)
    5 made a method print(); (Override method from parent class)
    6 Made a object of Data in which we passed ChildData (this is called upcasting)
    7 if we pass the value for int i then it execute print method of ChildData class and if we dont pass value for i then it 
      will execute print method for Data class
    8. is will execute method according to line number 7
 */