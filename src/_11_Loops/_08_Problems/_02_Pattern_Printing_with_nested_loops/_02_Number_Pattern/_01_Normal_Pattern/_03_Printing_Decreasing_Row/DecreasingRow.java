package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._01_Normal_Pattern._03_Printing_Decreasing_Row;

public class DecreasingRow {
    public static void main(String[] args) {
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 5; j >= 1 ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}