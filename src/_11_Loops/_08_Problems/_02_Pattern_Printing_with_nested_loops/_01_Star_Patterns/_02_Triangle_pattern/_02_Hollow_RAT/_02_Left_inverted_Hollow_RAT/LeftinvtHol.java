package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._02_Triangle_pattern._02_Hollow_RAT._02_Left_inverted_Hollow_RAT;

public class LeftinvtHol {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if ((i==1) || (j==5) || (i==j)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
