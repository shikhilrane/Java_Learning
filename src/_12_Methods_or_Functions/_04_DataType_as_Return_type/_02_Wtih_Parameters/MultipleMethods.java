package _12_Methods_or_Functions._04_DataType_as_Return_type._02_Wtih_Parameters;

public class MultipleMethods {
    public static void main(String[] args) {
        int sum = addn(43, 39);
        System.out.println("Sum is "+ sum);
    }
    public static int addn(int num1, int num2){
        int addn = num1 + num2 + nestedMethod(10, 3);
        return addn;
    }
    public static int nestedMethod(int a, int b){
        int substr = a-b;
        return substr;
    }
}
