package module6;
import java.util.*;
public class DifferenceArray {

        public static void main(String[] args) {

            int n = 5;

            int[] diff = new int[n];
            int[] arr = new int[n];

            int l = 1;
            int r = 3;
            int val = 10;

            diff[l] += val;

            if (r + 1 < n) {
                diff[r + 1] -= val;
            }

            arr[0] = diff[0];

            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + diff[i];
            }

            System.out.println(Arrays.toString(arr));
        }
    }

