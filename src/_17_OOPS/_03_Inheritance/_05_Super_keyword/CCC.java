package _17_OOPS._03_Inheritance._05_Super_keyword;// child class of class BBB

public class CCC extends BBB{
    void move2(){
        super.move1();                   // it will access move1(); method from its parent's class i.e. class BBB
    }
    CCC(){
        super();                        // it will execute constructor of BBB as well as constructor of AAA
    }

    public static void main(String[] args) {    // 1.
        CCC thirdClass = new CCC();
        System.out.println(thirdClass);         // 2.
        thirdClass.name = "Class CCC";
        thirdClass.color = "Black";
        thirdClass.move2();                     // 3.
        thirdClass.letters = 2;
        System.out.println("Executed property of class AAA, as we have set value for int letters = " + thirdClass.letters);  // 4.
    }
}

/*
    CCC will execute : 
        1. line number 12 : constructors of AAA and BBB
        2. line number 13 : thirdClass's object reference
        3. line number 16 : everything inside move1(); method
        4. line number 18 : it will execute value we set for property in class AAA.
 */