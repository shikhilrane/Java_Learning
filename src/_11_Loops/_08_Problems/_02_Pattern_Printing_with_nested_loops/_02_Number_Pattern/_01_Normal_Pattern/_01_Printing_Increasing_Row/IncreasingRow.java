package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._01_Normal_Pattern._01_Printing_Increasing_Row;

public class IncreasingRow {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
