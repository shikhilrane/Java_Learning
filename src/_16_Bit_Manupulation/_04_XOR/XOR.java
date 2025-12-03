package _16_Bit_Manupulation._04_XOR;

// Bitwise XOR or Exclusive OR
// it returns 0 if both comparing values are same and it returns 1 if both comparing values are different

public class XOR {
    public static void main(String[] args) {
        System.out.println(9^10);
    }
}

/*
    here,
    9 AND 10 is performed like,
         1 0 0 1     => is the binary of 9
    XOR  1 0 1 0     => is the binary of 10
         -------
         0 0 1 1     => is the binary of 3

    here if both numbers are different it returned 1, and if both numbers are same it returned 0
 */