package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._02_Triangle_Pattern._01_Ascending._01_Right_Angle_Triangle._02_Hollow_RAT._04_Right_Inverted_RAT;

public class HollowRightInvertedRAT {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i ; j--) {
                if ((i==1) || (j==5) || (i==j)){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
