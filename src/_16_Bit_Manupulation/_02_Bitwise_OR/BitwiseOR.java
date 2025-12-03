package _16_Bit_Manupulation._02_Bitwise_OR;

// Bitwise OR operator
// Bitwise Or, returns 0 only if all the values are zero

public class BitwiseOR {
    public static void main(String[] args) {
        System.out.println(9|10);
    }
}

/*
    here,
    9 OR 10 is performed like,
        1 0 0 1     => is the binary of 9
    OR  1 0 1 0     => is the binary of 10
        -------
        1 0 1 1     => is the binary of 11

    here if both are 0 it returned 0
 */