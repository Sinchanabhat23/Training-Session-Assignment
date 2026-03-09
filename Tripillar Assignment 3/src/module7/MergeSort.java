package module7;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int s, int e) {

        if (s >= e)
            return;

        int mid = (s + e) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        merge(arr, s, mid, e);
    }

    public static void merge(int[] arr, int s, int m, int e) {

        int[] temp = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {

            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= e)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[s + x] = temp[x];
    }

    public static void main(String[] args) {

        int[] arr = {5,3,8,2,1};

        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}