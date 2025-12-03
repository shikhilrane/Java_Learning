package _17_OOPS._04_Encapsulation._05_Java_Encapsulation._01_Data_Hiding_using_getter_and_setter;

// 1

// Data hiding using Encapsulation with getter and setter

public class Person {
    private int age;              // 1 Private variable
    private String name;          // 2 Private variable

    public void setAge(int age){  // 3 made a setters method by using this method another class can set value for this method
        this.age = age;           // this will let you set age
    }

    public int getAge(){  // 5 made a getter method by using this method another class can get value for this method
        return age;       // 6 this will let you print age in object
    }
}


/*
    1. made int type of private variable
    2. made StringClass type of private variable
    3. by using this method, object from another class can set value for private type variable
    4. it will set value for private variable
    5. by using this method, object from another class can access value for private type variable
    6. it will return value we set

    NOTE : These setting and getting methods are called getters and setters
 */