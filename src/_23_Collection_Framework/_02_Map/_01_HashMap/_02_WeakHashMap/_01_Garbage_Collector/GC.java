package _23_Collection_Framework._02_Map._01_HashMap._02_WeakHashMap._01_Garbage_Collector;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        //--------------------------------------------------- Strong Reference ---------------------------------------------------
        Phone phone = new Phone("Apple", "17 Pro Max");
        System.out.println(phone);

        phone = null;
        // After making phone as null, object related to this would become reference less, so JVM runs Garbage Collector, and Garbage collector will remove this unreferenced object from the memory
        // NOTE : We don't need explicitly tell to JVM to run System.gc() method, It runs in background
        // JVM implicitly removes the unreferenced object
        System.out.println(phone);

        //--------------------------------------------------- Weak Reference ---------------------------------------------------
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "S25 Ultra"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try {
            Thread.sleep(10000);
        }catch (Exception ignored){}
        System.out.println(phoneWeakReference.get());
        // Here, WeakReference<> doesn't hold the Strong Reference so Garbage Collector of JVM doesn't care if it is in the memory or not
        // That's why if we want to remove unused object then we have to run System.gc(); explicitly here
        // WeakReference is least used in codes
    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

// To understand WeakHashMap we first need to understand Garbage Collector