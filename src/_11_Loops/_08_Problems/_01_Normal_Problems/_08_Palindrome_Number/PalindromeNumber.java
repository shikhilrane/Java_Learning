package _11_Loops._08_Problems._01_Normal_Problems._08_Palindrome_Number;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 123454321;
        int original = n;
        int reversse = 0;
        while (n != 0) {
            int digit = n % 10;
            reversse = reversse * 10 + digit;
            n = n / 10;
        }
        if (original == reversse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}

/*
    Initial Values:
    n        = 123454321
    original = 123454321
    reverse  = 0


    Iteration 1:
    n       = 123454321
    digit   = 1
    reverse = 0 * 10 + 1 = 1
    n       = 12345432


    Iteration 2:
    n       = 12345432
    digit   = 2
    reverse = 1 * 10 + 2 = 12
    n       = 1234543


    Iteration 3:
    n       = 1234543
    digit   = 3
    reverse = 12 * 10 + 3 = 123
    n       = 123454


    Iteration 4:
    n       = 123454
    digit   = 4
    reverse = 123 * 10 + 4 = 1234
    n       = 12345


    Iteration 5:
    n       = 12345
    digit   = 5
    reverse = 1234 * 10 + 5 = 12345
    n       = 1234


    Iteration 6:
    n       = 1234
    digit   = 4
    reverse = 12345 * 10 + 4 = 123454
    n       = 123


    Iteration 7:
    n       = 123
    digit   = 3
    reverse = 123454 * 10 + 3 = 1234543
    n       = 12


    Iteration 8:
    n       = 12
    digit   = 2
    reverse = 1234543 * 10 + 2 = 12345432
    n       = 1


    Iteration 9:
    n       = 1
    digit   = 1
    reverse = 12345432 * 10 + 1 = 123454321
    n       = 0


    Loop Ends:
    ----------
    n = 0
    reverse = 123454321


    Final Check:
    ------------
    original == reverse
    123454321 == 123454321 → TRUE


    Output:
    -------
    Palindrome number
*/