package calc;
class Calc {
   int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Calc2 extends Calc {
    int add(int a, int b) {
        return a + b + 1;
    }
}
class main {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        Calc2 c2 = new Calc2();
        System.out.println(c2.add(5, 5));
    }
}