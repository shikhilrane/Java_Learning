package _11_Loops._08_Problems._01_Normal_Problems._09_Prime_Number;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {     // Constant time operation
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

/*
    Input:
    n = 29

    Initial Values:
    n       = 29
    isPrime = true


    Step 1: Check if n <= 1
    ----------------------
    n = 29
    Condition (n <= 1) → FALSE
    So, isPrime remains TRUE


    Step 2: for loop starts (i from 2 to n-1)
    -----------------------------------------

    Iteration 1:
    i = 2
    n % i = 29 % 2 = 1 (not 0)
    → No divisor found
    → isPrime remains TRUE


    Iteration 2:
    i = 3
    29 % 3 = 2
    → No divisor found


    Iteration 3:
    i = 4
    29 % 4 = 1
    → No divisor found


    Iteration 4:
    i = 5
    29 % 5 = 4
    → No divisor found


    Iteration 5:
    i = 6
    29 % 6 = 5
    → No divisor found


    ...
    (All values of i from 2 to 28 give remainder ≠ 0)


    Final Iteration:
    i = 28
    29 % 28 = 1
    → No divisor found


    Loop Ends:
    ----------
    No value of i divides 29 exactly
    isPrime is still TRUE


    Final Check:
    ------------
    isPrime == true


    Output:
    -------
    Prime number
*/