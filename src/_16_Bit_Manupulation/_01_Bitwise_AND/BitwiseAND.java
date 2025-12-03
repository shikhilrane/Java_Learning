package _16_Bit_Manupulation._01_Bitwise_AND;

// Bitwise AND operator
// Bitwise and returns 1 only if both comparing values are 1

public class BitwiseAND {
    public static void main(String[] args) {
        System.out.println(9&10);
    }
}

/*
    here,
    9 AND 10 is performed like,
        1 0 0 1     => is the binary of 9
    OR  1 0 1 0     => is the binary of 10
        -------
        1 0 0 0     => is the binary of 8

    here if both are 1 it returned 1
 */