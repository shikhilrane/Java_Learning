package _11_Loops._05_break_and_continue._02_Continue._02_While_Continue;

public class WhileContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            if (i==3) {                     // as soon as this condition met
                System.out.println("three is not included");
                i++;                        // need to increase i here to jump to next iteration
                continue;                   // this will be continued
            }
            System.out.println(i);
            i++;
        }
    }
}
