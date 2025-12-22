package _23_Collection_Framework._03_Comparable_and_Comparator._02_CodingShuttle.Comparable;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}

// Sorting logic ->
// Ascending - o1 is first element and o2 is second element (o1-o2), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// Descending - o2 is second element and o1 is first element (o2-o1), if substraction is positive then 2nd number first and if substraction is negative then 1st number first and if substraction is equal then both numbers are at same position
// That is, if substraction = positive then o2 will be preferred and if negative then o1 will be preferred, in any situation