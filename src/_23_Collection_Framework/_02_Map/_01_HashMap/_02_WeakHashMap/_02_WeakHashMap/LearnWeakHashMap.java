package _23_Collection_Framework._02_Map._01_HashMap._02_WeakHashMap._02_WeakHashMap;

import java.util.WeakHashMap;

public class LearnWeakHashMap {
    public static void main(String[] args) {
        // 1.
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1",  new Image("Image1"));
        imageCache.put("img2",  new Image("Image2"));
        System.out.println(imageCache);

        System.gc();

        try {
            System.out.println("Simulation Application Running...");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cache after running (some entries may be cleared) : " + imageCache);
        // Here, image cache won't get clean even after using System.gc();, because in WeakHashMap, garbage collection is happened only on keys (i.e. "img1" and "img2") and also garbage collection of values(i.e. new Image("Image1") and new Image("Image2")) will happen if they don't have any strong reference.
        // But we have provided here String as keys, and we know in java String remains in the string pool area throughout the lifecycle of the code and GC doesn't clean anything from Spring Pool Area. So, keys "img1" and "img2" won't be get removed even after running System.gc();

        // --------------------------------------------------- Key as Object of String -------------------------------------------------------------

        // 2.
        WeakHashMap<String, Image> imageCacheWhm = new WeakHashMap<>();
        imageCacheWhm.put(new String("img1"),  new Image("Image1"));
        imageCacheWhm.put(new String("img2"),  new Image("Image2"));
        System.out.println(imageCacheWhm);

        System.gc();

        try {
            System.out.println("Simulation Application Running...");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cache after running (some entries may be cleared) : " + imageCacheWhm);
        // As we have make keys as object of the string, then it will get stored in heap memory and will get removed as gc runs in heap memory
        // NOTE : If we stored this keys and values objects in Strong Reference, then we have to make it null before running System.gc();
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}