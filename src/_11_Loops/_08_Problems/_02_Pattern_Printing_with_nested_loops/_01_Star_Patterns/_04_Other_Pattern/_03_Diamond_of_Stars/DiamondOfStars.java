package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._04_Other_Pattern._03_Diamond_of_Stars;

public class DiamondOfStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 4; k >= i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i ; j--) {
                System.out.print("*");
            }
            for (int l = 5; l >= i ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
