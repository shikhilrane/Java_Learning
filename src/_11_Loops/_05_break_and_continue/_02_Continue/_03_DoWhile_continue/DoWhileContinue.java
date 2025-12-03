package _11_Loops._05_break_and_continue._02_Continue._03_DoWhile_continue;

public class DoWhileContinue {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 3) {                     // as soon as this condition met
                System.out.println("three is not included");
                i++;                          // need to increase i here to jump to next iteration
                continue;                     // this will be continued
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
