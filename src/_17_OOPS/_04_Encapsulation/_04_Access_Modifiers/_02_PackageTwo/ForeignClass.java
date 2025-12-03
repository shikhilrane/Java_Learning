// 3

package _17_OOPS._04_Encapsulation._04_Access_Modifiers._02_PackageTwo;

import _17_OOPS._04_Encapsulation._04_Access_Modifiers._01_PackageOne.Teacher;

public class ForeignClass extends Teacher {         // imported packageone to access properties and methods of Teacher class
    public static void main(String[] args) {
        ForeignClass obj2 = new ForeignClass();
        obj2.teacherClass = 11;                     // teacherClass will be define or modify (public)
        //obj2.id = 43;                             // id won't be define or modify (private)
        //obj2.degree = "B.Tech";                   // degree can't be define or modify (default)
        obj2.studentsCount = 120;                   // Student count can be define or modifiable (protected)
        System.out.println(obj2.teacherClass);      // teacherClass can be use here (public)
        //System.out.println(obj2.id);              // either id can't be use here (private)
        //System.out.println(obj2.degree);          // id can't be use here (default)
        System.out.println(obj2.studentsCount);     // studentsCount can be use here (protected)
    }
}
