package _15_Strings._06_String_Problems._01_Print_characters_of_String;

public class printChar {
    public static void main(String[] args) {
        String name  = "Shikhil";
        getChar(name);

    }
    public static void getChar(String myStr){
        for (int i = 0; i < myStr.length(); i++) {
            System.out.println(myStr.charAt(i));        // we have to use charAt() to extract character from StringClass
        }
    }    
}
