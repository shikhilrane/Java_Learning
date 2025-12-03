package _22_Generics._01_Generic_Class;

public class LearnGenerics {
    public static void main(String[] args) {

        // 1. We used, V = StringClass and E = Integer
        Dog<String, Integer> d1 = new Dog<>("Bruno", 32);   // 11
        System.out.println(d1.name);                                  // 12
        System.out.println(d1.id);
        System.out.println(d1.getName());
        System.out.println(d1.getId());

        // 2. We used, V = Boolean and E = StringClass
        Dog<Boolean, String> d2 = new Dog<>(true, "first");
        System.out.println(d2.name);
        System.out.println(d2.id);
        System.out.println(d2.name);
        System.out.println(d2.id);

        // ArrayList<Integer> a = new ArrayList<>();        // 13

    }
}

class Dog<V,E> {                    // 1
    V name;                         // 2
    E id;                           // 3
    public Dog(V name, E id){       // 4
        this.name = name;           // 5
        this.id = id;               // 6
    }

    V getName(){                    // 7
        return name;                // 8
    }

    E getId(){                      // 9
        return id;                  // 10
    }
}

/*
    1. created a class Dog
    2. Created a variable 'name' and instead of calling it by any data type, we assigned it random capital letter (we can 
       either keep one capital letter or single capital letter) and informed about it existence to class in <> bracket
    3. Created a variable 'id' and instead of calling it by any data type, we assigned it random capital letter (we can 
       either keep one capital letter or single capital letter) and informed about it existence to class in <> bracket
    4. made a constructor of class Dog and passed above variables in it
    5. assigned value to name
    6. assigned value to id
    7. made a method getName() that will return V
    8. that will return name 
    9. made a method getId() that will return E
   10. that will return id
   11. created a object of class Dog and during creation of object we have to state object data type of the variable we created 
       in class with respect to its sequence.
   12. called methhods and variables of class
   13. example of how we can create ArrayList of Integers
*/