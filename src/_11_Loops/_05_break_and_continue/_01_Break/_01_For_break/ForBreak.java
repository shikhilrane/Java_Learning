package _11_Loops._05_break_and_continue._01_Break._01_For_break;

public class ForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==7){                              // as soon as this condition met
                System.out.println("7 detected");
                break;                              // It will exit from the loop
            }
            System.out.println(i);
        }
        System.out.println("Exit from the loop");
    }
}
