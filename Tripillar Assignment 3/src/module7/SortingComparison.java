package module7;

import java.util.Arrays;

public class SortingComparison {
    // Bubble Sort
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        int[] a1 = arr.clone();
        int[] a2 = arr.clone();
        int[] a3 = arr.clone();

        bubbleSort(a1);
        selectionSort(a2);
        insertionSort(a3);

        System.out.println("Bubble Sort: " + Arrays.toString(a1));
        System.out.println("Selection Sort: " + Arrays.toString(a2));
        System.out.println("Insertion Sort: " + Arrays.toString(a3));
    }
}

