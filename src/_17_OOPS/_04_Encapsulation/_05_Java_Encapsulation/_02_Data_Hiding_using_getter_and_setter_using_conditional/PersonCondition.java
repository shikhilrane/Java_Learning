package _17_OOPS._04_Encapsulation._05_Java_Encapsulation._02_Data_Hiding_using_getter_and_setter_using_conditional;

// 3

// Data hiding using Encapsulation with getter and setter

public class PersonCondition {
    private int age;                // 1 Private variable
    @SuppressWarnings("unused")
    private String name;            // 2 Private variable

    boolean canBeSet = true;    // 3 if this condition is true, it will let you set value & if false then you can't set value

    public void setAge(int age){    // 4 made a setters method by using this method another class can set value for this method
        if (canBeSet) {         // 5 if it is true then it will let you set value for private variable
            this.age = age;         // this will let you set age
        }
    }

    public int getAge(){            // 6 made a getter method by using this method another class can get value for this method
        return age;                 // 7 this will let you print age in object
    }
}

/*
    1. made int type of private variable
    2. made StringClass type of private variable
    3. we can add condition like, if boolean say true then it will let you set value for private variable or if false then no
    4. made a setters method by using this method another class can set value for this method
    5. if it is true then it will let you set value for private variable
    6. by using this method, object from another class can access value for private type variable
    7. it will return value we set

    NOTE : These setting and getting methods are called getters and setters
 */