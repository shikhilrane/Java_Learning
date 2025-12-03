package _11_Loops._08_Problems._02_Pattern_Printing_with_nested_loops._02_Number_Pattern._02_Triangle_Pattern._01_Ascending._01_Right_Angle_Triangle._02_Hollow_RAT._01_Left_RAT;

public class HollowLeftRAT {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                if ((i==5) || (j==1) || (i==j)) {
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
