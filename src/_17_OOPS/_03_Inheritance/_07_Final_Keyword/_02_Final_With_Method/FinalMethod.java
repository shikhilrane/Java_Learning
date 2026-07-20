package _17_OOPS._03_Inheritance._07_Final_Keyword._02_Final_With_Method;

public class FinalMethod {
    final void accelarate(){
        System.out.println("Vehicle is accelarating");
    }
    public static void main(String[] args) {
        FinalMethod car = new FinalMethod();
        car.accelarate();
    }
}