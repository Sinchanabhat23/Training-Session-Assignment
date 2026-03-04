package module5;
import java.io.*;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception handled");
        }
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled");
        }
    }
}
