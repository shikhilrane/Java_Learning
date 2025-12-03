package _13_Arrays._04_Loops_on_Arrays._02_while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        // int in while loops
        System.out.println("iterative type of array in while loop");
        int rollNumbers[] = {31,32,33,34,35};                   // it will print all the elements of the array
        int i = 0;
        while (i<rollNumbers.length) {
            System.out.println(rollNumbers[i]);
            i++;
        }

        System.out.println("Addition");
        int ages[] = {11,22,33};                                // it will add all the elements of an array
        int l = 0;
        int sum = 0;
        while (l<ages.length) {
            sum = sum + ages[l];
            l++;
        }
        System.out.println(sum);

        System.out.println("Constructor type of array in while loop");
        int marks[] = new int[3];                               // it will print all the elements of constructor type of array
        marks[0] = 65;
        marks[1] = 67;
        marks[2] = 68;
        int j = 0;
        while (j<marks.length) {
            System.out.println(marks[j]);
            j++;
        }

        // StringClass in while loops
        System.out.println("StringClass in while loop");
        String myStr[] = {"Hello", "Hey", "Yes"};               // it will print all the elements of string type of array
        int k = 0;
        while (k<myStr.length) {
            System.out.println(myStr[k]);
            k++;
        }
    }
}
