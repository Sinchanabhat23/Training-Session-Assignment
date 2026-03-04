package module4;
public class StringDemo {
    public static void main(String[] args) {
        //String
        String s = "Holaaa";
        System.out.println("String before concat:" + s);
        s.concat("Team!!");
        System.out.println("String after concat:" + s); // String is immutable sp concat do not concat 2 strings
        //String Builder-> they are mutable
        StringBuilder sb = new StringBuilder("Holaaa");
        sb.append(" Team!!");
        System.out.println("StringBuilder value: " + sb);
        //String Buffer->they are mutable
        StringBuffer sbf = new StringBuffer("Holaa");
        sbf.append(" Team!!");
        System.out.println("StringBuffer value: " + sbf);
        System.out.println("HashCode of String: " + s.hashCode());
        System.out.println("HashCode of StringBuilder: " + sb.hashCode());
        System.out.println("HashCode of StringBuffer: " + sbf.hashCode()); // Time taken in high
    }
}