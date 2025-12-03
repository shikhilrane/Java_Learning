package _28_Multithreading._10_DeadLock._01_Deadlock_Issue;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to access paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using pen");
    }

}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to access pen");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using paper");
    }
}

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);    // Thread 1, locks pen and tries to lock paper.
    }
}

class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen);    // Thread 2, locks paper and tries to lock pen.
    }
}

public class LearnDeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper =  new Paper();

        Thread t1 = new Thread(new Task1(pen,paper), "Thread 1");
        Thread t2 = new Thread(new Task2(pen,paper), "Thread 2");

        t1.start();
        t2.start();
    }
}

/*
    1. Created class Pen, and made method writeWithPenAndPaper() and passed Paper class as paper

    2. Pen class has two synchronized methods:
       writeWithPenAndPaper(Paper paper): locks Pen object when called.
       finishWriting(): also locks Pen object when called.

    3. Created class Paper with two synchronized methods:
       writeWithPaperAndPen(Pen pen): locks Paper object when called.
       finishWriting(): also locks Paper object when called.

    4. In main method:
       Created one Pen object: Pen pen = new Pen();
       Created one Paper object: Paper paper = new Paper();

    5. Created two threads:
        Thread 1 (Task1):
            Holds references to Pen pen and Paper paper.
            Calls pen.writeWithPenAndPaper(paper);
            Locks Pen first (because method is synchronized on Pen).
            Inside, calls paper.finishWriting() which tries to lock Paper.

        Thread 2 (Task2):
            Holds references to Pen pen and Paper paper.
            Calls paper.writeWithPaperAndPen(pen);
            Locks Paper first (because method is synchronized on Paper).
            Inside, calls pen.finishWriting() which tries to lock Pen.

    6. Deadlock scenario before resolution:
        Thread 1 holds Pen lock and waits for Paper lock. It actually locks whole object Pen pen = new Pen(); so couldn't accessible to paper
        Thread 2 holds Paper lock and waits for Pen lock. It actually locks whole object Paper paper = new Paper(); so couldn't accessible to Pen
        Both threads stuck waiting indefinitely.

    7. Summary of locking:
        Synchronized instance methods lock the entire object instance.
        Lock is shared across all synchronized methods of that object.
        Threads competing for the same object's synchronized methods will be blocked until lock is released.

                  [Thread 1]                        [Thread 2]
                 Holds: Pen 🖊️                     Holds: Paper 📄
                      |                                  |
                      v                                  v
                Waiting for 📄 Paper             Waiting for 🖊️ Pen

                         \                          /
                          \                        /
                           -----------⛓️-----------
                              Deadlock!
*/


















/*
    Same code with Thread class

    class Pen {
        public synchronized void writeWithPenAndPaper(Paper paper) {
            System.out.println(Thread.currentThread().getName() + " is using pen and trying to access paper");
            paper.finishWriting();
        }

        public synchronized void finishWriting() {
            System.out.println(Thread.currentThread().getName() + " finished using pen");
        }
    }

    class Paper {
        public synchronized void writeWithPaperAndPen(Pen pen) {
            System.out.println(Thread.currentThread().getName() + " is using paper and trying to access pen");
            pen.finishWriting();
        }

        public synchronized void finishWriting() {
            System.out.println(Thread.currentThread().getName() + " finished using paper");
        }
    }

    // Thread 1: Calls pen.writeWithPenAndPaper(paper)
    class Thread1 extends Thread {
        private Pen pen;
        private Paper paper;

        public Thread1(Pen pen, Paper paper) {
            this.pen = pen;
            this.paper = paper;
            this.setName("Thread 1");
        }

        @Override
        public void run() {
            pen.writeWithPenAndPaper(paper);
        }
    }

    // Thread 2: Calls paper.writeWithPaperAndPen(pen) but first synchronizes on pen to prevent deadlock
    class Thread2 extends Thread {
        private Pen pen;
        private Paper paper;

        public Thread2(Pen pen, Paper paper) {
            this.pen = pen;
            this.paper = paper;
            this.setName("Thread 2");
        }

        @Override
        public void run() {
            paper.writeWithPaperAndPen(pen);
        }
    }

    public class DeadlockResolve {
        public static void main(StringClass[] args) {
            Pen pen = new Pen();
            Paper paper = new Paper();

            Thread t1 = new Thread1(pen, paper);
            Thread t2 = new Thread2(pen, paper);

            t1.start();
            t2.start();
        }
    }

*/