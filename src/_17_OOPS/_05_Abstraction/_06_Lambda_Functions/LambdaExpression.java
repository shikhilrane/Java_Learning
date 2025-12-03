package _17_OOPS._05_Abstraction._06_Lambda_Functions;

public class LambdaExpression {
    public static void main(String[] args) {

        // Type 1
        SuperInterface obj = () -> {                                    // 4
            System.out.println("This is Lambda Expression");            // 5
        };
        obj.interfaceMethod();                                          // 6

        // Type 2
        WalkAble object = (int steps) -> {
            System.out.println("Walked " + steps + " steps");
            return steps;
        };
        object.walk(5);

        // Type 3
        WalkAble object2 = (int steps) -> steps;
        System.out.println("Type three walked " + object2.walk(8) + " steps");
    }
}

@FunctionalInterface                                                    // 1 means interface in which only one public abstract method which has no body.
interface SuperInterface{                                               // 2
    void interfaceMethod();                                             // 3
}

@FunctionalInterface
interface WalkAble {
    int walk(int steps);    
}

/*
    Type 1 : 
    1. Annotation for Showing following class is Functional Interface
    2. Created a Functional Interface (single methods)
    3. Passed a single method in it
    4. Created object directly for subclass of interface SuperInterface (here concept is like anonymous interface but with 
       single method) () means we are implementing hat single method from Functional Interface , -> means it is lambda function, input comes within {}
    5. executable code
    6. executed method

    Type 2 : 
    1. we just add int steps in bracket
    2. return that statement as we state in Functional Interface it will return int
    3. executed method with input

    Type 3 : 
    1. It is a advance version of Type 2
    2. When we know, it will return it will return input and dont want to add sout kind of statement to our things then we can 
       use this
*/