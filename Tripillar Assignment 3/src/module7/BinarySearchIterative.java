package module7;

public class BinarySearchIterative {

        public static void main(String[] args) {

            int[] arr = {1, 3, 5, 7, 9, 11};

            int target = 7;

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (arr[mid] == target) {
                    System.out.println("Found at index " + mid);
                    return;
                }

                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println("Not found");
        }
    }
