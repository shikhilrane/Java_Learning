package _28_Multithreading._13_Lambda_Expression._01_Lambda_Expression;

public class LearnLambdaExpression {
    public static void main(String[] args) {
        // 1. Runnable Interface with anonymous function
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//        Thread t1 = new Thread(runnable);
//        t1.start();


        // 2. Runnable Interface with Lambda Expression
        Runnable runnable = () -> System.out.println("Hello");
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}