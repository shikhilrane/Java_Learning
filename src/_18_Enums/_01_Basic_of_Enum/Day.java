package _18_Enums._01_Basic_of_Enum;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public void display(){
        System.out.println(this.name());
    }
}

/*
    1. all these inputs have sequence from 0 to 6
    2. This enum will convert into a class
    3. And as this will get converted into the class, then we can even make method in it (name is inbuilt property here)
*/