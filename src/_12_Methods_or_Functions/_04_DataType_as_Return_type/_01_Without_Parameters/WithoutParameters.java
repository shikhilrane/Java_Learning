package _12_Methods_or_Functions._04_DataType_as_Return_type._01_Without_Parameters;

public class WithoutParameters {
    public static void main(String[] args) {
        int sum = addn();
        System.out.println("Sum is " + sum);
    }
    public static int addn(){
        int num1 = 43;
        int num2 = 54;
        int addn = num1+num2;
        return addn;
    }
}
