package _11_Loops._05_break_and_continue._01_Break._02_While_break;

public class WhileBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            if (i==4) {             // as soon as this condition met
                break;              // It will exit from the loop
            }
            System.out.println(i);
            i++;
        }
    }
}
