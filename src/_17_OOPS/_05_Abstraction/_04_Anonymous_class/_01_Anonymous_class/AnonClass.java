package _17_OOPS._05_Abstraction._04_Anonymous_class._01_Anonymous_class;

public class AnonClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass(){                  // 3
            @Override
            public void outerMethod(){                      // 4
                System.out.println("Overridden, This is Class");    // 5
            }
        };
        obj.outerMethod();                                  // 6
    }
}

class OuterClass{                       // 1
    public void outerMethod(){          // 2
        System.out.println("This is Class");
    }
}

/*
    1. We can only make anonymous class when we want to create subclass for anonymous class
    2. We can make a normal type of inner class as well but as we gave the name InnerClass so it doesn't consider as anonymous class
    3. We don't need to give name to subclass here;
    4. Syntax to write anonymous class, OuterClass_Name Object_name = new OuterClass_Name(){};
    5. We don't need to parent extend class to child class.
    6. While creating anonymous class, we have to use {} and write our overridden code of parent class in it, after ()
    7. This type of class can be create when we want to use subclass only single time
    8. It creates anonymoous class in files too with $ symbol
    9. It is similar to extending parent class to child class 
   10. We can't make multiple object of anonymous class (can't make object of OuterClass obj = new OuterClass(){})
   11. It does't have any physical present, it just come in memory and works and leave the memory
   12. we use this type of class while making comparator
    
    Execution of code : 
        1. Made a parent class
        2. Add method in it
        3. Made a subclass (it looks like it is a object but actually it a subclass of OuterClass without name).
        4. Called a method from OuterClass
        5. Override OuterClass content.
        6. Called a method.
        7. Class name AnonClass$1.class is anonymous class
*/