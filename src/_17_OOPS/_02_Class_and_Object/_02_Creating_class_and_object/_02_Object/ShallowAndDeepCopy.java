package _17_OOPS._02_Class_and_Object._02_Creating_class_and_object._02_Object;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1);         // Deep Copy because a new object is created
        Random r3 = r1;                     // Shallow Copy because both variables point to the same object
    }
}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Random(Random r) {
        this.x = r.x;
        this.y = r.y;
    }
}

/*
    r2 is a Deep Copy because a new object is created with copied values.
    Changes made to r2 will not affect r1.

    r3 is a Shallow Copy because no new object is created.
    Both r1 and r3 point to the same object in the heap, so changes made through one reference will also be visible through the other.
*/