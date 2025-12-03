package _11_Loops._05_break_and_continue._02_Continue._04_ContinueProblems;

public class multipleOfThree {
    public static void main(String[] args) {
        // Skip multiples of 3
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("This is multiple of 3");
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        // Same problem with While loop
        int i = 1;
        while (i<=50){
            if (i % 3== 0) {
                System.out.println("Skipped because multiple of 3 detected");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
