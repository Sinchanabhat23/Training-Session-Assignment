
// LeetCode 39 – Combination Sum

package module9;
import java.util.*;
public class CombinationExample {
        public static void find(int[] arr, int target, int index, List<Integer> list) {
            if (target == 0) {
                System.out.println(list);
                return;
            }
            if (target < 0) return;
            for (int i = index; i < arr.length; i++) {
                list.add(arr[i]);
                find(arr, target - arr[i], i, list);
                list.remove(list.size() - 1);
            }
        }
        public static void main(String[] args) {
            int[] arr = {2, 3, 6, 7};
            find(arr, 7, 0, new ArrayList<>());
        }
    }

