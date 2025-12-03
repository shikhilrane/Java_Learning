package _23_Collection_Framework._03_Comparable_and_Comparator;

import java.util.*;

class MyCustomDogComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class LearnComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4,"Leo", 10);
        Animal a2 = new Animal(2,"Bruno", 4);
        Animal a3 = new Animal(1,"Max", 6);
        Animal a4 = new Animal(3,"Don", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println("Before sorting:");
        System.out.println(dogs);

        Collections.sort(dogs, new MyCustomDogComparator());

        System.out.println("After sorting by weight:");
        System.out.println(dogs);

        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("After sorting by name:");
        System.out.println(dogs);

        Collections.sort(dogs, ( o1, o2) -> Integer.compare(o1.age, o2.age));
        System.out.println("After sorting by age:");
        System.out.println(dogs);

        Collections.sort(dogs, Comparator.comparing(Animal::getWeight));
        System.out.println("After sorting by weight:");
        System.out.println(dogs);

        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
        System.out.println(dogs);

        int a[][] = {
                {4,5,2},
                {5,1,2},
                {1,4,7}
        };
        Arrays.sort(a, (arr1, arr2) -> arr1[0]-arr2[0]);
        for (int e[] : a){
            for (int ele : e){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
