package _17_OOPS._03_Inheritance._07_Final_Keyword._02_Final_With_Method;

public class subClassFinalMethod extends FinalMethod {
    // void accelarate(){                // we can't override this method as we have used final keyword with accelarate(); in its parent class
    //     System.out.println("vehicle is accelerating so fast");
    // }
    public static void main(String[] args) {
        subClassFinalMethod sfm = new subClassFinalMethod();
        sfm.accelarate();               // but we can access the method from its parent class which is finalised
    }
}