package _17_OOPS._07_Java_Object_class._04_getClass;

public class LearnGetclass {
    public static void main(String[] args) {
        LearnGetclass lg = new LearnGetclass();
        System.out.println(lg.getClass());

        OuterClass oc = new OuterClass();
        System.out.println(oc.getClass());
    }
}

class OuterClass {

}