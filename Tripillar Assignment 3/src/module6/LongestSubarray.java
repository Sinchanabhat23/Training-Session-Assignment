package module6;

public class LongestSubarray {
    //Find the longest subarray with sum equal to k.
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 1, 1, 1, 1};
            int k = 3;
            int maxLength = 0;

            for (int i = 0; i < arr.length; i++) {

                int sum = 0;

                for (int j = i; j < arr.length; j++) {

                    sum = sum + arr[j];

                    if (sum == k) {
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }

            System.out.println(maxLength);
        }

    }

