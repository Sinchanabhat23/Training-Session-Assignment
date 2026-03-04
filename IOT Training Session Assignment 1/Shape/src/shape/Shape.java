package shape;
class Shape {   
void draw() {
        System.out.println("Shape draw");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle draw");
    }
}
class main
{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}