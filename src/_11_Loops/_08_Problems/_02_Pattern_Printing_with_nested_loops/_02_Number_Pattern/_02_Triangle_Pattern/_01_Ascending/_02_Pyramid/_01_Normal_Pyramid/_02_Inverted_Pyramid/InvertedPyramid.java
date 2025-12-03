package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._02_Triangle_Pattern._01_Ascending._02_Pyramid._01_Normal_Pyramid._02_Inverted_Pyramid;

public class InvertedPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
