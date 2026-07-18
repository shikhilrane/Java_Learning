package _17_OOPS._03_Inheritance._07_Final_Keyword._03_Final_With_Class;

public class SubClassForParent extends ParentClassFinal {
    void accelarate(){
        System.out.println("vehicle is accelarating so fast");
    }
    public static void main(String[] args) {
        SubClassForParent sfm = new SubClassForParent();
        sfm.accelarate();
    }
}
