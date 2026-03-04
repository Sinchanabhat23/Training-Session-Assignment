package module4;

public class FinalClass {
        void display() {
            System.out.println("This is a final class");
        }
    }
    class Parent {
        final void show() {
            System.out.println("This is a final method");
        }
    }
    class Child extends Parent {
    }
    class FinalDemo {
        public static void main(String[] args) {
            final int number = 10;
            System.out.println("Final variable value: " + number);
            Parent p = new Parent();
            p.show();
            FinalClass fc = new FinalClass();
            fc.display();
        }
    }

