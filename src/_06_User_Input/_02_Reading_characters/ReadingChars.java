package _06_User_Input._02_Reading_characters;

import java.util.*;

public class ReadingChars {
    public static void main(String[] args) {
        // reading character using scanner class
        Scanner ch = new Scanner(System.in);
        System.out.println("enter the word of which you to know indexing");
        char ch1 = ch.next().charAt(6);
        System.out.println("character at index 6 is " + ch1);

        Scanner chh = new Scanner(System.in);
        System.out.println("enter the sentence of which you to know indexing"); //it work for same scanner class if input satisfies both the object i.e. object ch1 and object ch2. otherwise we want to make another class for this object (i.e. ch2). If we use same method for both objects i.e. ch.nextLine then we can take different input for both objects
        char ch2 = chh.nextLine().charAt(11);
        System.out.println("character at index 11 is " + ch2);
    }
}
