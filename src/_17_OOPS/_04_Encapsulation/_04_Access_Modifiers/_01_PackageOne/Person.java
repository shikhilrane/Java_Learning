// 2

package _17_OOPS._04_Encapsulation._04_Access_Modifiers._01_PackageOne;

public class Person extends Teacher{                    // made this a child class of Teacher class
    public static void main(String[] args) {
        Person objPerson = new Person();
        objPerson.teacherClass = 11;                    // teacherClass will be defined or modify (public)
        // objPerson.id = 43;                           // id won't be defined or modify (private)
        objPerson.degree = "B.Tech";                    // degree will be define or modify (default)
        objPerson.studentsCount = 105;                  // Student count can be defined or modifiable (protected)
        System.out.println(objPerson.teacherClass);     // teacherClass can be use here (public)
        // System.out.println(objPerson.id);            // either id can't be use here (private)
        System.out.println(objPerson.degree);           // id can be use here (default)
        System.out.println(objPerson.studentsCount);    // studentsCount can be use here (default)
    }
}