package _11_Loops._07_labelBreak_and_lableContinue;

public class _02_LabelContinue {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j<=5) {
                if (j==4) {
                    continue outerLoop;    // skip current outer loop iteration when j == 4
                }
                System.out.print(j + " ");
                j++;
            }
            System.out.println();   // this line will be skipped if j == 4
        }
    }
}
