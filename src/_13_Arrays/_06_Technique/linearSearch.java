package _13_Arrays._06_Technique;// Linear search is used to search specific number in an array

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16,18,20};                       // 1.

        System.out.println("Enter a key you wanna search for : ");
        int key = scn.nextInt();                                        // 7.
        int gotKey = getKeyFL(nums, key);                               // 8.
        if (gotKey==-1) {                                               // 9.
            System.out.println("NOT Found");
        }
        else{                                                           // 10.
            System.out.println("This key is " + gotKey);
        }
    }

    // Linear search using for loop
    public static int getKeyFL (int findNum[], int key){                // 2.
        for (int i = 0; i < findNum.length; i++) {                      // 3.
            if (findNum[i]==key) {                                      // 4.
                return key;                                             // 5.
            }
        }
        return -1;                                                      // 6.
    } 

    // Linear search using forEach loop
    public static int getKeyFE (int getkey[], int key){
        for (int i : getkey) {
            if (i==key) {
                return key;
            }
        }
        return -1;
    }

    // Linear search using while loop
    public static int getKeyWL(int getKey[], int key){
        int i = 0;
        while (i<getKey.length) {
            if (getKey[i]==key) {
                return key;
            }
            i++;
        }
        return -1;
    }

    // Linear search using do-while loop
    public static int getKeyDWL(int getKey[], int key){
        int i = 0;
        do {
            if (getKey[i]==key) {
                return key;
            }
            i++;
        } while (i<getKey.length);
        return -1;
    }
}

/*
    1. made an array
    2. created a function in which we passed array and int as a parameter (array will be used to seach in that specific array and int key will be used to find that key in that array)
    3. applied loop for that specidic array which we passed as an parameter in fucntion (this for loop will iterate over the array which is passd as a parameter in a function);
    4. if our desired key found in that array
    5. function will return that key
    6. otherwise if not found function will return -1
    7. took key from user input
    8. saved result of function in a variable
    9. if function returned -1, we will show it as NOT Found
    10.if function return our desired key then we will use it
 */