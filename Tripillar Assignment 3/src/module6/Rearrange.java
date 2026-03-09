package module6;
public class Rearrange {
    //Rearrange an array so that even index contains even numbers
        public static void main(String[] args) {

            int[] arr = {3, 6, 1, 8, 4, 5};

            for (int i = 0; i < arr.length; i++) {

                if (i % 2 == 0 && arr[i] % 2 != 0) {

                    for (int j = i + 1; j < arr.length; j++) {

                        if (arr[j] % 2 == 0) {

                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

