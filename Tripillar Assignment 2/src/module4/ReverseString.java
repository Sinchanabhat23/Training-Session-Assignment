package module4;

public class ReverseString {
    public static void main(String[] args) {
        String str = "lufituaeb era uoY";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb.toString());
    }
}

