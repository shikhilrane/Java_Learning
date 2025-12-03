package _11_Loops._02_for_Loop._ForLoopProblems;

public class TableOfNum {
    public static void main(String[] args) {
        // 1st way
        int num = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.println();
        System.out.println("Another way");
        System.out.println();

        // 2nd way
        int number = 4;
        int table = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (table = number * i));
        }
        System.out.println(table);
    }
}
