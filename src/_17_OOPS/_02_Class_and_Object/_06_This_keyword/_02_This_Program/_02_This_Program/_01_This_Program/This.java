package _17_OOPS._02_Class_and_Object._06_This_keyword._02_This_Program._02_This_Program._01_This_Program;

public class This {
    public static void main(String[] args) {
        UnderstandingThis obj1 = new UnderstandingThis(12,54);  // this.a = 12 & this.b = 54
        obj1.print();
        UnderstandingThis obj2 = new UnderstandingThis(23,65);  // this.a = 23 & this.b = 65
        obj2.print();
    }    
}

class UnderstandingThis{
    int a;
    int b;

    public UnderstandingThis(int a, int b){
        this.a = a;     // this.a = int a and a = value we gonna put in object constructor i.e. 12 or 23, so this.a = 12 or this.a = 23 respectively
        this.b = b;     // this.a = int a and a = value we gonna put in object constructor i.e. 54 or 65, so this.b = 54 or this.b = 65 respectively
    }

    void print(){
        System.out.println(this);
        System.out.println(a+b);
    }
}