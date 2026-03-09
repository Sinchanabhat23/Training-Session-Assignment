package module7;

public class BinarySearchRecursive {
        public static int binarySearch(int[] arr, int start, int end, int target) {

            if (start > end) {
                return -1;
            }

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                return binarySearch(arr, start, mid - 1, target);
            }

            return binarySearch(arr, mid + 1, end, target);
        }

        public static void main(String[] args) {

            int[] arr = {2, 4, 6, 8, 10};

            int index = binarySearch(arr, 0, arr.length - 1, 8);

            System.out.println(index);
        }
    }
