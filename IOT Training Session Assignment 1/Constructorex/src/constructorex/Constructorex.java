package Constructorex;
class Student {
    int id;
    String name;
    Student() {
       id=104;
       name="Sinchana";
        }
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}
public class Constructorex {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(104, "Sinchana");
        s1.display();
        s2.display();
    }
}
   
