package _17_OOPS._05_Abstraction._07_Mutable_And_Immutable_Class;

public class ImmutableClass {
    public static void main(String[] args) {
        Collegee college = new Collegee("IIT G", "Assam");

        Studentt s1 = new Studentt(28, "Aditya", college);

        System.out.println(s1.getCollege().name); // IIT G

        s1.getCollege().name = "IIT B";

        System.out.println(s1.getCollege().name); // IIT G
    }
}

// Immutable
// defensive copy of college (non primitive)
final class Studentt {
    private final int age;
    private final String name;
    private final Collegee college;

    Studentt(int age, String name, Collegee college) {
        this.age = age;
        this.name = name;
        this.college = new Collegee(college.name, college.address);
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Collegee getCollege() {
        return new Collegee(this.college.name, this.college.address);
    }
}

// Mutable
class Collegee {
    String name;
    String address;

    Collegee(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

/*
    Immutable Class Notes:

    1. Student class is final and all fields are final.
    2. College is mutable, so we use Defensive Copy.
    3. In constructor, a new College object is created instead of storing the original reference.
    4. So Student has its own private copy of College.
    5. getCollege() also returns a new College object every time.
    6. Outside code changes only the copied object.
    7. Student's original College object never changes.
    8. This is why Student becomes truly immutable.

    Flow:
        Original College Object
                 ↓
        Constructor creates a new copy
                 ↓
          Student stores the copied object
                 ↓
        getCollege() returns another new copy
                 ↓
        Outside modifies only the copy
                 ↓
        Student's original data remains unchanged
*/