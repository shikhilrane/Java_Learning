package _12_Methods_or_Functions._10_Method_Scope;

// we can use variable in the method where we defined that particular variable. We can't use that variable outside that method
// we can use variable only as a parameter

public class MethodScope {
    public static void main(String[] args) {
        // System.out.println(a);               // this won't execute as variable is defined after this operation
        int a = 3;
        System.out.println(a);
    }
    public static void methodScope(){
        // System.out.println(a);               // this won't be executed as well because a is defined in another method
    }

}
