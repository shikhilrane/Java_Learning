package _17_OOPS._02_Class_and_Object._02_Creating_class_and_object._02_Object;

public class CallByValue {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println(x + " , " + y);

        addTen(x, y);

        System.out.println(x + " , " + y);

    }

    static void addTen(int x, int y) {
        x = x + 10;
        y = y + 10;
    }
}

/*
    Here values did not change because Java passes copies of primitive values.
    The method receives copies of 'x' and 'y', so any modification inside addTen() affects only the copies, not the original variables.
*/