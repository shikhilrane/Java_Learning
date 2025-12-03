package _28_Multithreading._10_DeadLock._02_Deadlock_Resolve;

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
        pen.writeWithPenAndPaper(paper);
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
        synchronized (pen){                     // Resolved a deadlock here, Locking Pen first
            paper.writeWithPaperAndPen(pen);    // Then trying to lock Paper
        }
    }
}

public class DeadlockResolve {
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
    Deadlock resolution in Task2:
       - Added explicit synchronized block on Pen object before calling paper.writeWithPaperAndPen(pen).
       - Now Thread 2 locks Pen first, then Paper.
       - Both threads follow the same lock acquisition order: Pen → Paper.
       - This prevents circular wait, avoiding deadlock.

        [SOLVED DEADLOCK]

                        [Thread 1]                             [Thread 2]
                        Holds: Pen 🖊️                          Tries to lock: Pen 🖊️ (waits)
                              |                                       |
                              v                                       |
                        Calls: paper.finishWriting()                 —X (waiting for Pen 🖊️)
                              |
                        Acquires: Paper
                              |
                              v
                        Releases: Pen 🖊️ and Paper

                        Then → Thread 2 acquires Pen, then Paper safely
                        No circular wait
                        No deadlock

*/