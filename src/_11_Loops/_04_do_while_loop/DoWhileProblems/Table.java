package _11_Loops._04_do_while_loop.DoWhileProblems;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        int num = 4;
        int table = 0;
        do {
            table=num*i;
            System.out.println(table);
            i++;
        }while (i<=10);
    }
}
