package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._02_Triangle_Pattern._01_Ascending._02_Pyramid._02_Hollow_Pyramid._01_Hollow_Normal_Pyramid_;

public class HollowPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i==5) || (j==1) || (i==j)){
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
