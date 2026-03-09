package module7;
    public class FirstLastOccurrence {

        public static int first(int[] arr, int target) {

            int start = 0, end = arr.length - 1;
            int ans = -1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    end = mid - 1;
                }

                else if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

            return ans;
        }

        public static int last(int[] arr, int target) {

            int start = 0, end = arr.length - 1;
            int ans = -1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    start = mid + 1;
                }

                else if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

            return ans;
        }

        public static void main(String[] args) {

            int[] arr = {1,2,2,2,3,4};

            System.out.println(first(arr,2));
            System.out.println(last(arr,2));
        }
    }

