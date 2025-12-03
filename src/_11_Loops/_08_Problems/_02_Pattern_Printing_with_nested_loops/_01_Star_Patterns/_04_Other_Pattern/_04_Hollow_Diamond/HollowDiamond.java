package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._04_Other_Pattern._04_Hollow_Diamond;

public class HollowDiamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print("* ");
            }
            for (int k = 2; k <= i ; k++) {
                System.out.print("    ");       // 4 spaces, because we added space with stars
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int k = 4; k >= i ; k--) {
                System.out.print("    ");       // 4 spaces, because we added space with stars
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}