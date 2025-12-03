package _11_Loops._04_do_while_loop.DoWhileProblems;

public class SumOfFirstNNum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            System.out.println(sum);
            i++;
        }while (i<=10);
        System.out.println(sum);
    }
}
