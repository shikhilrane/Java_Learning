package _11_Loops._08_Problems._01_Normal_Problems._11_Binary_and_Decimal;

public class ConversionProblem {
    public static void main(String[] args) {
        // Conversion of Binary to Decimal
        int binaryNum = 101;
        int ans = 0;
        int power = 1;
        while (binaryNum>0){
            int lastDigit = binaryNum % 10;   // taking last binary digit
            ans = ans + (lastDigit * power);  // adding decimal value of current digit
            binaryNum /= 10;                  // removing last digit
            power *= 2;                       // moving to next power of 2
        }
        System.out.println(ans);


        // Conversion of Decimal to Binary
        int decimalNum = 11;
        int answer = 0;
        int pw = 1;
        while (decimalNum>0){
            int parity = decimalNum % 2;      // remainder after dividing by 2
            answer = answer + (parity * pw);  // adding binary digit at correct place
            pw *= 10;                         // moving to next binary place value
            decimalNum /= 2;                  // reducing number by dividing by 2
        }
        System.out.println(answer);
    }
}

/*
    Dry run -
        1. Conversion of Binary to Decimal :
            Initial:
            binaryNum = 1010
            ans = 0
            power = 1

            1st iteration:
            lastDigit = 1010 % 10 = 0
            ans = 0 + (0 × 1) = 0
            binaryNum = 1010 / 10 = 101
            power = 1 × 2 = 2

            2nd iteration:
            lastDigit = 101 % 10 = 1
            ans = 0 + (1 × 2) = 2
            binaryNum = 101 / 10 = 10
            power = 2 × 2 = 4

            3rd iteration:
            lastDigit = 10 % 10 = 0
            ans = 2 + (0 × 4) = 2
            binaryNum = 10 / 10 = 1
            power = 4 × 2 = 8

            4th iteration:
            lastDigit = 1 % 10 = 1
            ans = 2 + (1 × 8) = 10
            binaryNum = 1 / 10 = 0
            power = 8 × 2 = 16

            Loop ends

            Final Answer = 10


        2. Conversion of Decimal to Binary
            Initial:
            decimalNum = 11
            answer = 0
            pw = 1

            1st iteration:
            parity = 11 % 2 = 1
            answer = 0 + (1 × 1) = 1
            pw = 1 × 10 = 10
            decimalNum = 11 / 2 = 5

            2nd iteration:
            parity = 5 % 2 = 1
            answer = 1 + (1 × 10) = 11
            pw = 10 × 10 = 100
            decimalNum = 5 / 2 = 2

            3rd iteration:
            parity = 2 % 2 = 0
            answer = 11 + (0 × 100) = 11
            pw = 100 × 10 = 1000
            decimalNum = 2 / 2 = 1

            4th iteration:
            parity = 1 % 2 = 1
            answer = 11 + (1 × 1000) = 1011
            pw = 1000 × 10 = 10000
            decimalNum = 1 / 2 = 0

            Loop ends

            Final Answer = 1011
*/