package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._02_Triangle_Pattern._01_Ascending._02_Pyramid._02_Hollow_Pyramid._02_Hollow_Inverted_Pyramid;

public class HollowInvertedPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i ; j--) {
                if ((i==1) || (j==5) || (i==j)){
                    System.out.print(j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
