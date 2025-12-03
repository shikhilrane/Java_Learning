package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._02_Triangle_pattern._01_RAT._03_Right_Rat;

public class rightRat {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}