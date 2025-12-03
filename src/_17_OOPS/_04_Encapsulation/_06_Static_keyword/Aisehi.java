package _17_OOPS._04_Encapsulation._06_Static_keyword;

// 6

public class Aisehi {
    static int i;
    int si (){                          // This is how we can assign value to static value to static variable
        Aisehi.i = 3;                   // directly assign value to static variable
        return 3;                       // this way we can return value for static keyword
    }

    public static void main(String[] args) {
        System.out.println(i);
        Aisehi asi = new Aisehi();      // if we go from this way then we have to make value make object for that class
        System.out.println(asi.si());   // printing value for i
        Aisehi.i = 5;
        System.out.println(Aisehi.i);
    }
}
