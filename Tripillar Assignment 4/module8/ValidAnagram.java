
// Valid Anagram -> LeetCode 242

package module8;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s = sc.next();
        System.out.println("Enter the second string:");
        String t = sc.next();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) { // Arrays.equals is used for char array and primitive type array. For strings and objects we use only equals
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given strings are not anagrams");
        }
    }
}