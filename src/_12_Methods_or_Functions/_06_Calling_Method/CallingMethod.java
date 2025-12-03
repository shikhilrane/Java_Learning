package _12_Methods_or_Functions._06_Calling_Method;

// this is how our method calling is done

public class CallingMethod {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        greet();                                // after executing first two statements this will start executing
        System.out.println(6);                  // after executing greet(); 6,7 will execute
        System.out.println(7);
    }
    public static void greet(){                 // when greet(); method is called by main function, this will start executing
        System.out.println("greet " + 3);
        System.out.println("greet " + 4);
        walk();
        System.out.println("greet" + 5.1);
    }
    public static void walk(){                  // when walk(); method is called by greet(); function, this will start executing
        System.out.println("walk " + 5);
    }
}
