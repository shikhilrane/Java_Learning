package _16_Bit_Manupulation._03_Bitwise_NOT;

// Bitwise NOT operator
// It inverts all the bits of the number

public class BitwiseNOT {
    public static void main(String[] args) {
        System.out.println(~9);
    }
}

/*
    here,
    ~9 is performed like,
        1 0 0 1     => is the binary of 9
        -------
        0 1 1 0     => is the binary of -10

    here if number is 0 it returned 1, and if number is 1 it returned 0
 */