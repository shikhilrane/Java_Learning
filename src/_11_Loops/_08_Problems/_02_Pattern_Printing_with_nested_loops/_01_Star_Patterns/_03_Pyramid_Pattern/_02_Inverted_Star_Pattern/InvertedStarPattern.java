package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._03_Pyramid_Pattern._02_Inverted_Star_Pattern;

public class InvertedStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 2; k <= i ; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
