package module5;

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        });
        System.out.println("State after creation: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
        Thread.sleep(100);
        System.out.println("State during sleep: " + t.getState());
        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}