package _11_Loops._07_labelBreak_and_lableContinue;

public class _01_LabelBreak {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j<=5) {
                if (j==4) {
                    break outerLoop;    // When value of j reaches to 4, then it will exits from label outerloop given to loop
                }
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}
