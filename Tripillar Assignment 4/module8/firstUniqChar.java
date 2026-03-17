
//LeetCode 387 –> First Unique Character in a String

package module8;
import java.util.Scanner;
public class firstUniqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        int[] count=new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)-'a']==1){
                System.out.println(s.charAt(i));
            }
        }
        System.out.println("First Occurrence of Character not found");
    }
}
