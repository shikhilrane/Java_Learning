package _23_Collection_Framework._03_Comparable_and_Comparator._01_Enginnering_Digest.Comparable;

import java.util.ArrayList;
import java.util.List;

public class LearnComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Adam", 3.9));
        list.sort(null);
        System.out.println(list);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa(), this.getCgpa()); // Descending
        // return Double.compare(this.getCgpa(), o.getCgpa()); // Ascending
    }
}

/*
    1. Created a student class and implemented with Comparable and pass <Student> in it
    2. Wrote Properties, Constructor, getters, toString() and compareTo() method which is responsible for comparing two objects
    3. compareTo(); -> It actually compare current object with another object. If Current object is second then Descending otherwise Ascending
    4. Then used this method in main method by creating object of the Student object



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