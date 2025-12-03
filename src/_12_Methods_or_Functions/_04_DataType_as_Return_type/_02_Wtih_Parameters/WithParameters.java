package _12_Methods_or_Functions._04_DataType_as_Return_type._02_Wtih_Parameters;

// return type as data type with parameters

public class WithParameters {
    public static void main(String[] args) {
        int sum = addn(56, 87);
        System.out.println("Sum is " + sum);
    }
    public static int addn(int num1, int num2){
        int addn = num1+num2;
        return addn;
    }
}
