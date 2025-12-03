// 1

package _17_OOPS._04_Encapsulation._04_Access_Modifiers._01_PackageOne;

public class Teacher {
    public int teacherClass;        // public (anywhere accessible.)
    private int id;                 // private (only within Teacher class, not even to person class which is present in same package)
    String degree;                  // default (only within packageOne folder)
    protected int studentsCount;    // protected (accessible to AnotherPack class, as we have made AnotherPack class child of Teacher class, also available to person class becasue by using protected we can give access anywhere within same package)
    public static void main(String[] args) {
        Teacher objTeacher = new Teacher();
        objTeacher.teacherClass = 10;                   // teacherClass will be defined or modify (public)
        objTeacher.id = 12345;                          // id will be defined or modify (private)
        objTeacher.degree = "B.Tech";                   // degree will be define or modify (default)
        objTeacher.studentsCount = 100;                 // studentsCount can be defined or modify (protected)
        System.out.println(objTeacher.teacherClass);    // teacherClass can be use here (public)
        System.out.println(objTeacher.id);              // id can be use here (private)
        System.out.println(objTeacher.degree);          // degree can be use here (default)
        System.out.println(objTeacher.studentsCount);   // studentsCount can be use here
    }
}
