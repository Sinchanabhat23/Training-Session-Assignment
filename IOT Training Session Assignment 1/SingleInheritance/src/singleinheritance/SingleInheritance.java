package singleinheritance;
public class SingleInheritance {
     class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
static class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
}