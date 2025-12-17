package _23_Collection_Framework._02_Map._01_HashMap._02_WeakHashMap._02_WeakHashMap;

import java.util.WeakHashMap;

public class LearnWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCahe = new WeakHashMap<>();
        imageCahe.put("img1",  new Image("Image1"));
        imageCahe.put("img2",  new Image("Image2"));
        System.out.println(imageCahe);
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