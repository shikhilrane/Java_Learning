package _13_Arrays._07_Problems;

// Palindrome
// A palindrome is a word, sentence, verse, or even number that reads the same backward or forward

public class palindrome {
    public static void main(String[] args) {
        int name[]  = {123454321};
        boolean getPalindrome = palindromeFL(name);
        if (getPalindrome==false) {
            System.out.println("It is not a palindrome number");
        }
        else{
            System.out.println("It is a palindrome number");
        }
    }

    // palindrome number using for loop
    public static boolean palindromeFL (int myArr[]){
        for (int i = 0; i < myArr.length/2; i++) {      // 1.
            int n = myArr.length;                       // 2.
            if (myArr[i]!=myArr[n-1-i]) {               // 3.
                return false;                           // 4.
            }
        }
        return true;                                    // 5.
    }

    // Palindrome number using while loop
    public static boolean palindromeFE (int myArr[]){
        int i = 0;
        int n = myArr.length/2;
        while (i<myArr.length/2) {
            if (myArr[i]!=myArr[n-1-i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

/*
        1. used a for loop and started it with first index, then we have to check array only upto half length because elements after half length
           will be compared with myArr.length/2
        2. saved length to use that length in conditional
        3. before != , it will extract elements from the array (myArr[0]=1, then myArr[1]=2, then myArr[2]=3, then myArr[3]=4
            5 will be compared with itself                            ||            ||           ||                  ||
           after  != , it will be elements from end to middle(myArr[9-1-0]=1, myArr[9-1-1]=2, myArr[9-1-2]=3, myArr[9-1-3]=4
        4. if any condition doesn't matches with anyone then it will turn false
        5. else true
*/