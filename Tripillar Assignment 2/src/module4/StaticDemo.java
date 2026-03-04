package module4;
class Student {
    int rollNo;
    String name;
    static String college = "SCE";
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void changeCollege() {
        college = "SNPSU";
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student(104, "Raam");
        Student s2 = new Student(106, "Shaam");
        s1.display();
        s2.display();
        Student.changeCollege();
        s1.display();
        s2.display();
    }
}
