package _17_OOPS._05_Abstraction._07_Mutable_And_Immutable_Class;

public class MutableClass {
    public static void main(String[] args) {
        College college = new College("IIT G", "Assam");
        Student s1 = new Student(28, "Aditya", college);
        System.out.println(s1.getCollege().name); // IIT G
        s1.getCollege().name = "IIT B";
        System.out.println(s1.getCollege().name); // IIT B
    }
}

// (NOt purely immutable)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return this.college;
    }
}

// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

/*
    Mutable Class Notes:

    1. Student class is final and all fields are final, but it is still NOT immutable.
    2. Reason: College is a mutable object (non-primitive/reference type).
    3. Constructor stores the same College object reference.
    4. getCollege() returns the original College object.
    5. So anyone can modify the College object from outside.
    6. Both Student and outside code point to the same College object.
    7. Changing college.name from outside also changes Student's data.
    8. This is why Student is called "Not Purely Immutable".

    Flow:
        Original College Object
                 ↑
          Student.college
                 ↑
        getCollege() returns the same object
                 ↑
        Outside code modifies it
                 ↑
        Student data also changes
*/