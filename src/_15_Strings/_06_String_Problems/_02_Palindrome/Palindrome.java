package _15_Strings._06_String_Problems._02_Palindrome;// Palindrome
// A palindrome is a word, sentence, verse, or even number that reads the same backward or forward

public class Palindrome {
    public static void main(String[] args) {
        String name = "racecar";
        boolean getPalindrome = palindrome(name);
        System.out.println(getPalindrome);
    }    
    public static boolean palindrome(String myStr){
        for (int i = 0; i < myStr.length()/2; i++) {        // 1. 
            int n = myStr.length();                         // 2.
            if (myStr.charAt(i)!=myStr.charAt(n-1-i)) {     // 3.
                return false;                               // 4.
            }
        }
        return true;                                        // 5.
    }
}

/*
        1. used a for loop and started it with first index, then we have to check StringClass only upto half length because letters after half length
           will be compared with string.legth()/2
        2. saved legth to use that length in conditional
        3. before != , it will extract characters from the string (myStr.charAt(0))=r, then myStr.charAt(1)=a, then myStr.charAt(2)=r,
           and then myStr.charAt(3)=e it will be compared with it self   ||                    ||                      ||
           after  != , it will be characters from end to middle (myStr.charAt(7-1-0)=r, then myStr.charAt(7-1-1)=a, then myStr.charAt(7-1-2)=_02_Stream)
        4. if any condition doesn't matches with anyone then it will turn false
        5. else true
 */