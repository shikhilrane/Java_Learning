package _17_OOPS._03_Inheritance._07_Final_Keyword._03_Final_With_Class;

public /* final */ class ParentClassFinal {
    void accelarate(){
        System.out.println("Vehicle is accelarating");
    }
    public static void main(String[] args) {
        ParentClassFinal car = new ParentClassFinal();
        car.accelarate();
    }
}
