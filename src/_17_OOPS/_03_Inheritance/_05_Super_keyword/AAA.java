package _17_OOPS._03_Inheritance._05_Super_keyword;// main class

public class AAA {
    String name;
    int letters;
    int number;

    void move(){
        System.out.println("AAA is moving");
    };

    AAA(){                                      // made a constructor
        System.out.println("AAA, non parameterised constructor executed");
    }

    AAA(int number){                            // made a parameterised constructor in which we passed int number
        this.number = number;                   // it will assign value to int number when we put number digit in object constructor
        System.out.println("AAA, parameterised constructor executed " + number); // if we pass argument in object constructor this will execute
    }

    public static void main(String[] args) {
        AAA firstClass = new AAA(3);
        firstClass.move();
    }
}

/*
    AAA will execute : 
        1. line number 21 : it will depend which constructor to execute on if we pass parameter it will execute line 16 & if not then line 12
        2. line number 23 : move() (System.out.println("AAA is moving");)
 */