package _17_OOPS._03_Inheritance._05_Super_keyword;// child class of class AAA and parent class of class CCC

public class BBB extends AAA {
    String color;
    void move1(){
        super.move();                                                   // it will access move(); method from its parent's class i.e. class AAA
        System.out.println(this.name + " BBB is moving fast");
        System.out.println(this.color + " BBB is moving fast");
        System.out.println(this.number);                                // it will print 5 because we updated it 
    };
    BBB(){                                                              // constructor for BBB
        super(33); // it will access constructor from its parent's class i.e. class AAA, if we pass value inside it will execute parameterised con
        System.out.println("BBB constructor");          // this will execute 
    }
    public static void main(String[] args) {
        BBB secondClass = new BBB();
        System.out.println(secondClass + " reference of Object from print statement");
        secondClass.name = "Class BBB,";
        System.out.println(secondClass.number);                         // it will print 33 because we set it as 33 before
        secondClass.number = 5;
        secondClass.color = "blue";
        secondClass.move1();
    }
}

/*
    BBB will execute : 
        1. line number 15   :   Constructor of AAA & constructor of BBB
        3. line number 17   :   System.out.println(secondClass + " reference of Object from print statement");
        4. line number 19   :   System.out.println(secondClass.number);
        5. line number 22   :   secondClass.move1(); (super.move();
                                                      System.out.println(this.name + " BBB is moving fast");
                                                      System.out.println(this.color + " BBB is moving fast");
                                                      System.out.println(this.number);)
 */