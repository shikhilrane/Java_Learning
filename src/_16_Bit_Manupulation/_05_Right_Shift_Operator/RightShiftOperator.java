package _16_Bit_Manupulation._05_Right_Shift_Operator;

// Right shift operator
// It requries 2 operands to perform this operation
// It shift the binary of the first number to right side according to second number in the memory

public class RightShiftOperator {
    public static void main(String[] args) {
        System.out.println(9>>2);
    }
}

/*
    here,
    binary of 9 shifted 2 places to right
    binary of 9 is 1001
    _ _ _ _ 1 0 0 1
    and when we applied right shift 2,
    _ _ _ _ _ _ 1 0
    here 1001 got shifted to right and last two digit (i.e. 01) got eliminated from memory
    right shift = a/(2^b)
*/