package _17_OOPS._04_Encapsulation._05_Java_Encapsulation._02_Data_Hiding_using_getter_and_setter_using_conditional;

// 4

// setting and getting value for private variable using getter and setter

public class TeacherCondition extends PersonCondition{
    public static void main(String[] args) {
        PersonCondition p1 = new PersonCondition();
        p1.setAge(20);                          // 1 it will set age according to condition from Person class
        System.out.println(p1.getAge());        // 2 it will print age with get method from person class
    }
}

/*
    1. it will set value for private variable
    2. it will access we set for private variable
*/