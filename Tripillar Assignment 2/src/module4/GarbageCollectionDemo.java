package module4;

public class GarbageCollectionDemo {
    protected void finalize() { //deprecated in java
        System.out.println("Garbage collected");
    }
    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
        obj1 = null; // garbage
        obj2 = null;
        System.gc();
    }
}

