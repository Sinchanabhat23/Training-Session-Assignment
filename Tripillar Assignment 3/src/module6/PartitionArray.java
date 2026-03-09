package module6;
import java.util.Arrays;
public class PartitionArray {
        public static void main(String[] args) {

            int[] arr = {3, -1, 4, -5, 2, -2};

            int j = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < 0) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    j++;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
    }

