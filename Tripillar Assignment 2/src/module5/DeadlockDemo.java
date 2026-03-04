package module5;

public class DeadlockDemo {
    static final Object obj1 = new Object();
    static final Object obj2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("Thread 1 locked obj1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (obj2) {
                    System.out.println("Thread 1 locked obj2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("Thread 2 locked obj2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (obj1) {
                    System.out.println("Thread 2 locked obj1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}