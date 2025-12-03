package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._01_Star_Patterns._01_Normal_Patterns._02_Hollow_Rectangle_Pattern;

public class hollowRectPatt {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 6) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
    Interation 1 (i=1):
    •⁠  ⁠j=1: *
    •⁠  ⁠j=2: *
    •⁠  ⁠j=3: *
    •⁠  ⁠j=4: *
    •⁠  ⁠j=5: *
    •⁠  ⁠j=6: *
    Output: ******

    Interation 2 (i=2):
    •⁠  ⁠j=1: *
    •⁠  ⁠j=2:
    •⁠  ⁠j=3:
    •⁠  ⁠j=4:
    •⁠  ⁠j=5:
    •⁠  ⁠j=6: *
    Output: *     *

    Interation 3 (i=3):
    •⁠  ⁠j=1: *
    •⁠  ⁠j=2:
    •⁠  ⁠j=3:
    •⁠  ⁠j=4:
    •⁠  ⁠j=5:
    •⁠  ⁠j=6: *
    Output: *     *

    Interation 4 (i=4):
    •⁠  ⁠j=1: *
    •⁠  ⁠j=2: *
    •⁠  ⁠j=3: *
    •⁠  ⁠j=4: *
    •⁠  ⁠j=5: *
    •⁠  ⁠j=6: *
    Output: ******

    Final Output:
    * * * * * *
    *         *
    *         *
    * * * * * *
 */