package _11_Loops._05_break_and_continue._02_Continue._01_For_continue;

public class ForContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i==6) {                     // as soon as this condition met
                System.out.println("six not included");
                continue;                   // that iteration will be skipped
            }
            System.out.println(i);
        }
    }
}
