package _28_Multithreading._13_Lambda_Expression._02_LE_Example;

public class MainClass {
    public static void main(String[] args) {
        // 1. Implementing a class that implements Student Interface (multiple inheritance)
        EnggSudent es1 = new EnggSudent();
        String a = es1.getBio("A");
        System.out.println(a);

        // 2. Directly implementing Interface using anonymous function (Direct implementing interface with anonymous function)
        Student std1 = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is engineering student";
            }
        };
        String b = std1.getBio("B");
        System.out.println(b);

        // 3. Directly implementing Interface using anonymous function
        Student std2 = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is a Law student";
            }
        };
        String c = std2.getBio("C");
        System.out.println(c);

        // 4. Lambda Expression
        Student std3 = name -> name + " is CA student";
        String d = std2.getBio("D");
        System.out.println(d);

        // 5. Thread direct implementation of Runnable interface through lambda expression
        Thread t1 = new Thread(() -> System.out.println("Hello"));
        t1.start();

        // 6. Thread direct implementation of Runnable interface through lambda expression with multiple line of execution.
        Thread t2 = new Thread(() -> {
            System.out.println("Hey");
            System.out.println("World");
        });
        t2.start();
    }
}
