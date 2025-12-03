package _28_Multithreading._15_Java_Executor_Framework._01_Object._02_Callable;

public class CallableInterface {
    public interface Callable<V> {
        V call() throws Exception;  // Task returns a result and can throw exception
    }
}
