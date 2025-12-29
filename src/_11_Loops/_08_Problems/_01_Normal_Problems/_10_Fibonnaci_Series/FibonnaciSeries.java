package _11_Loops._08_Problems._01_Normal_Problems._10_Fibonnaci_Series;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

/*
    Input:
    n = 5

    Initial Values:
    a = 0
    b = 1


    Iteration 1 (i = 1):
    -------------------
    Printed value = a = 0
    next = a + b = 0 + 1 = 1
    a = b = 1
    b = next = 1

    Current Fibonacci series:
    0


    Iteration 2 (i = 2):
    -------------------
    Printed value = a = 1
    next = a + b = 1 + 1 = 2
    a = b = 1
    b = next = 2

    Current Fibonacci series:
    0 1


    Iteration 3 (i = 3):
    -------------------
    Printed value = a = 1
    next = a + b = 1 + 2 = 3
    a = b = 2
    b = next = 3

    Current Fibonacci series:
    0 1 1


    Iteration 4 (i = 4):
    -------------------
    Printed value = a = 2
    next = a + b = 2 + 3 = 5
    a = b = 3
    b = next = 5

    Current Fibonacci series:
    0 1 1 2


    Iteration 5 (i = 5):
    -------------------
    Printed value = a = 3
    next = a + b = 3 + 5 = 8
    a = b = 5
    b = next = 8

    Current Fibonacci series:
    0 1 1 2 3


    Loop Ends:
    ----------
    i > n


    Final Output:
    -------------
    0 1 1 2 3
*/