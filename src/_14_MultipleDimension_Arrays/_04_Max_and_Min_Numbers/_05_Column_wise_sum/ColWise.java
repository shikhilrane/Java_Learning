package _14_MultipleDimension_Arrays._04_Max_and_Min_Numbers._05_Column_wise_sum;

public class ColWise {
    public static void main(String[] args) {
        int ages[][] = {
                {43,65,76},
                {30,81,93},
                {14,77,92}
        };

        for (int j = 0; j < ages[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < ages.length; i++) {
                sum = sum + ages[i][j];
            }
            System.out.println("Sum of column " + j + " = " + sum);
        }
    }
}
