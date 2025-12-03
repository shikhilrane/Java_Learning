package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._04_Other_Pattern._01_Square_Plus;

public class SquarePlus {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                if ((i==1) || (i==5) || (i==9) || (j==1) || (j==5) || (j==9)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
