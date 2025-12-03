package _13_Arrays._04_Loops_on_Arrays._03_doWhile_loop;

public class DoWhile {
    public static void main(String[] args) {
        // int in do-while loops
        System.out.println("iterative type of array in do-while loop");
        int rollNumbers[] = {31,32,33,34,35};                   // it will print all the elements of the array
        int i = 0;
        do {
            System.out.println(rollNumbers[i]);
            i++;
        } while (i<rollNumbers.length);

        System.out.println();

        System.out.println("moral rights");
        System.out.println("translate a work");

        System.out.println("Addition");
        int ages[] = {11,22,33};                                // it will add all the elements of an array
        int l = 0;
        int sum = 0;
        do {
            sum = sum + ages[l];
            l++;
        } while (l<ages.length);
        System.out.println(sum);

        System.out.println();

        System.out.println("Constructor type of array in do-while loop");
        int marks[] = new int[3];                               // it will print all the elements of constructor type of array
        marks[0] = 65;
        marks[1] = 67;
        marks[2] = 68;
        int j = 0;
        do {
            System.out.println(marks[j]);
            j++;
        } while (j<marks.length);

        System.out.println();

        // StringClass in do-while loops
        System.out.println("StringClass in do-while loop");
        String myStr[] = {"Hello", "Hey", "Yes"};               // it will print all the elements of string type of array
        int k = 0;
        do {
            System.out.println(myStr[k]);
            k++;
        } while (k<myStr.length);
    }
}
