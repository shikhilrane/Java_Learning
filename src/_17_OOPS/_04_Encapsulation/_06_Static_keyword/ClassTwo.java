package _17_OOPS._04_Encapsulation._06_Static_keyword;

// 2

public class ClassTwo {
    public static void greeting(){          // 7 static method
        System.out.println("Good Evening!");
        // greet();                         // 12 but we cant do that because we know non-static variable only executes if object are made of them but we can execute static methods without even making their objects

    }

    public void greet(){                    // 9 non-static method
        System.out.println("Hello word");
        greeting();                         // 11 we can add static methods in non-static methods as well, because we know that static methods executes with or without object so ir can be execute here as well
    }

    public static void main(String[] args) {
        System.out.println(ClassOne.count);     // 1 it will execute even before creating a class as we know that int count is static so it is independent of class

        ClassOne c1 = new ClassOne();           // 2 yellow line because it says, no need to make class as there is only static keyword present which is independent of object
        c1.count = 12;                          // 3 yellow line because it says, as int count is static variable so it is independent of object c1 and we can update static variable anywhere
        System.out.println(c1.count);           // 4 yellow line because it says, as int count is static variable so it is independent of object c1

        ClassOne c2 = new ClassOne();
        c2.count = 15;                          // 5 for all the objects of class ClassOne, value for static variable will be the same and can be updated (updating static variable value is not best practice)
        System.out.println(c2.count);

        // 6 this is the way you should access the static variable
        ClassOne.count = 20;                    // as we know count is static keyword it can be accessed and update directly with class name
        System.out.println(ClassOne.count);     // as we know count is static keyword it can be accessed and update directly with class name
        // example, to access Math class we dont need to make object for Math class

        ClassTwo.greeting();                // 8 static method that can be accessed without creating an object

        ClassTwo cl2 = new ClassTwo();      // 10 we need to make object for non-static methods to access it.
        cl2.greet();

        ClassOne c3 = new ClassOne();
        System.out.println(ClassOne.count); // 13 it will print how many times we use ClassOne class to make object

    }
}

/*
    1. static variable executes at compile time while non static variable compiles at runtime
    2. If we think, method of which we dont need to make object for that method then we can use staic methods
*/