package _23_Collection_Framework._03_Comparable_and_Comparator._01_Enginnering_Digest.Comparator;

import _23_Collection_Framework._01_Collection_Interface._01_List_Interface._01_ArrayList.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LearnComparator {
    public static void main(String[] args) {
        // Sorting using Class
        List<Integer> list1 = Arrays.asList(5, 4, 7, 3, 2, 9, 8);
        System.out.println("list1 = Arrays.asList(5, 4, 7, 3, 2, 9, 8)");
        // 1. Sorting Integers in Ascending order
        list1.sort( null);
        System.out.println("Sorting Integers in Ascending order using Class : " + list1);
        // 2. Sorting Integers in Descending order
        list1.sort(new IntComparator());
        System.out.println("Sorting Integers in Descending order using Class : " + list1);

        System.out.println();

        // Sorting using Lambda Expression
        List<Integer> list2 = Arrays.asList(50, 40, 70, 30, 20, 90, 80);
        System.out.println("list2 = Arrays.asList(50, 40, 70, 30, 20, 90, 80)");
        // 1. Sorting Integers in Ascending order
        list2.sort((a,b) -> a-b);
        System.out.println("Sorting Integers in Ascending order using Lambda expression : " + list2);
        // 2. Sorting Integers in Descending order
        list2.sort((a,b) -> b-a);
        System.out.println("Sorting Integers in Descending order using Lambda expression: " + list2);

        System.out.println();

        List<String> list3 = Arrays.asList("cat", "pineapple", "dog", "apple", "banana");
        System.out.println("list3 = Arrays.asList(\"cat\", \"pineapple\", \"dog\", \"apple\", \"banana\")");
        // Sorting String from a to z order
        list3.sort(null);
        System.out.println("Sorting String from a to z order : " + list3);
        // Sorting String from z to a order
        list3.sort(new StringDescendingComparator());
        System.out.println("Sorting String from z to a order : " + list3);
        // Sorting String in Ascending of length
        list3.sort(new StringLengthComparatorAscLeng());
        System.out.println("Sorting String in Ascending of length : " + list3);
        // Sorting String in Descending of length
        list3.sort(new StringLengthComparatorDescLeng());
        System.out.println("Sorting String in Descending of length : " + list3);

        System.out.println();

        // Sorting using Lambda Expression
        List<String> list4 = Arrays.asList("Air", "Balloon", "Car", "Duck", "Elephant");
        System.out.println("list4 = Arrays.asList(\"Air\", \"Balloon\", \"Car\", \"Duck\", \"Elephant\")");
        // Sorting String from a to z order
        list4.sort((a,b) -> a.compareTo(b));
        System.out.println("Sorting String from a to z order using Lambda Expression : " + list4);
        // Sorting String from z to a order
        list4.sort((a,b) -> b.compareTo(a));
        System.out.println("Sorting String from z to a order using Lambda Expression : " + list4);
        // Sorting String in Ascending of length
        list4.sort((a,b) -> a.length()-b.length());
        System.out.println("Sorting String in Ascending of length using Lambda Expression : " + list4);
        // Sorting String in Descending of length
        list4.sort((a,b) -> b.length()-a.length());
        System.out.println("Sorting String in Descending of length using Lambda Expression : " + list4);

        System.out.println();

        // Sorting on Basis of name and gpa
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Adam", 3.9));

        System.out.println("List<Student> students = new ArrayList<>();\n" +
                "        students.add(new Student(\"Charlie\", 3.5));\n" +
                "        students.add(new Student(\"Bob\", 3.7));\n" +
                "        students.add(new Student(\"Alice\", 3.5));\n" +
                "        students.add(new Student(\"Adam\", 3.9));");

        // 1. Sorting in Ascending order of marks
        students.sort((a,b) -> {
            if ((b.getGpa()-a.getGpa())>0){
                return 1;   // Return 1 means b is greater, from previous sorting knowledge
            } else if ((b.getGpa()-a.getGpa())<0) {
                return -1;  // Return -1 means a is greater, from previous sorting knowledge
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting in Ascending order of marks : " + std.getName() + " " + std.getGpa());
        }

        // 2. Sorting in Descending order of marks
        students.sort((a,b) -> {
            if ((a.getGpa()-b.getGpa())>0){
                return 1;   // Return 1 means b is greater
            } else if ((a.getGpa()-b.getGpa())<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting in Descending order of marks : " + std.getName() + " " + std.getGpa());
        }

        // 3. Sorting name letter from a to z
        students.sort((a,b) -> {
            if ((a.getName().compareTo(b.getName()))>0){
                return 1;   // Return 1 means b is greater
            } else if ((a.getName().compareTo(b.getName()))<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting name letter from a to z : " + std.getName() + " " + std.getGpa());
        }

        // 4. Sorting name letter from z to a
        students.sort((a,b) -> {
            if ((b.getName().compareTo(a.getName()))>0){
                return 1;   // Return 1 means b is greater from previous sorting
            } else if ((b.getName().compareTo(a.getName()))<0) {
                return -1;  // Return -1 means a is greater
            } else {
                return 0;
            }
        });

        for(Student std : students){
            System.out.println("Sorting name letter from z to a : " + std.getName() + " " + std.getGpa());
        }
    }
}


// Sorting logic ->
// Ascending - o1 is first element and o2 is second element (o1-o2), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// Descending - o2 is second element and o1 is first element (o2-o1), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// That is, if substraction = positive then o2 will be preferred and if negative then o1 will be preferred, in any situation

// Integers
class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
//        return o1-o2;       // This will return numbers in ascending order
        return o2-o1;       // This will return numbers in descending order
    }
}


// String
class StringDescendingComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);  // Reverse of natural order
    }
}


class StringLengthComparatorAscLeng implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

class StringLengthComparatorDescLeng implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}

// Class for sorting on field of class
class Student{
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

/*
        | Feature                | Comparable                        | Comparator                      |
        | ---------------------- | --------------------------------- | ------------------------------- |
        | Package                | `java.lang`                       | `java.util`                     |
        | Method                 | `compareTo()`                     | `compare()`                     |
        | Sorting logic          | Defined **inside the class**      | Defined **outside the class**   |
        | Number of sorting ways | **Only one** natural order        | **Multiple** sorting strategies |
        | Modifies class         | **Yes** (class must implement it) | **No** (separate class/lambda)  |
        | Used for               | Default / natural ordering        | Custom / flexible ordering      |
        | `list.sort(null)`      | ✔ Uses `compareTo()`              | Not used                        |
        | Example sorting        | By ID, rollNo, name (one way)     | By name, CGPA, age, etc.        |
*/