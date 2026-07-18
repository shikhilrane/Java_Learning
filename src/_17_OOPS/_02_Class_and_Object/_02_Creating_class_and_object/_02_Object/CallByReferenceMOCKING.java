package _17_OOPS._02_Class_and_Object._02_Creating_class_and_object._02_Object;

// Call by reference --> There is no call by reference in java. We just mocked it in this program.

public class CallByReferenceMOCKING {
    public static void main(String[] args) {
        RandomClass r1 = new RandomClass(4, 5);

        System.out.println(r1.x + " , " + r1.y);

        addTen(r1);

        System.out.println(r1.x + " , " + r1.y);

    }
    static void addTen(RandomClass r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class RandomClass {
    int x;
    int y;

    RandomClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/*
    Here values got changed because Java passes a copy of the object reference.
    Both 'r' and 'r1' point to the same object in the heap, so modifying
    the object's fields through 'r' also changes the original object.
*/