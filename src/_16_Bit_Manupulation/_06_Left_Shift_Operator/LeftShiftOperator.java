package _16_Bit_Manupulation._06_Left_Shift_Operator;

// Left shift operator
// It requries 2 operands to perform this operation
// It shifts the binary of the first number to left according to second number in the memory

public class LeftShiftOperator {
    public static void main(String[] args) {
        System.out.println(9<<2);
    }
}

/*
    here,
    binary of 9 shifted 2 places to left
    binary of 9 is 1001
    _ _ _ _ 1 0 0 1
    and when we applied left shift 2,
    _ _ 1 0 0 1 0 0
    here 1001 got shifted to left and that black space got occupied by 0
    left shift = a*(2^b)
*/