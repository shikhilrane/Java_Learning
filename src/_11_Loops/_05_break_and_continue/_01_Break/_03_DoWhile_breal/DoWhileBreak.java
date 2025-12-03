package _11_Loops._05_break_and_continue._01_Break._03_DoWhile_breal;

public class DoWhileBreak {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i==5) {         // as soon as this condition met
                break;          // It will exit from the loop
            }
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}
