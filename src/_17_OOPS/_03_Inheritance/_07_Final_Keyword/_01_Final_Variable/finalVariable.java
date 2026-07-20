package _17_OOPS._03_Inheritance._07_Final_Keyword._01_Final_Variable;

public class finalVariable {
    final int gears = 4;                            // we used final keyword with variable and must need to assign value
    public static void main(String[] args) {
        finalVariable obj1 = new finalVariable();
        // obj1.gears = 6;                          // after using final keyword with specific variable we can't modify them
        System.out.println(obj1.gears);
    }
}