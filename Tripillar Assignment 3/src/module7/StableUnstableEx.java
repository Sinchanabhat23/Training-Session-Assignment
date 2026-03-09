package module7;
import java.util.Arrays;

// Student class to store marks and name
class Student {

    int marks;
    String name;

    // constructor
    Student(int m, String n) {
        marks = m;
        name = n;
    }

    // to print object
    public String toString() {
        return "(" + marks + "," + name + ")";
    }
}

public class StableUnstableEx {

    // ---------------- Bubble Sort (STABLE)
    // Stable because equal elements keep same order
    static void bubble(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j].marks > arr[j + 1].marks) {

                    Student t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }
    }

    // ---------------- Insertion Sort (STABLE)
    // Stable because shifting keeps order
    static void insertion(Student[] arr) {

        for (int i = 1; i < arr.length; i++) {

            Student temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].marks > temp.marks) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    // ---------------- Selection Sort (UNSTABLE)
    // Unstable because swapping changes order
    static void selection(Student[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].marks < arr[min].marks) {
                    min = j;
                }
            }

            // swap
            Student t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    // ---------------- Merge Sort (STABLE)
    // Stable because merge keeps order for equal elements
    static void mergeSort(Student[] arr, int s, int e) {

        if (s >= e) return;

        int m = (s + e) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        merge(arr, s, m, e);
    }

    static void merge(Student[] arr, int s, int m, int e) {

        Student[] temp = new Student[e - s + 1];

        int i = s, j = m + 1, k = 0;

        while (i <= m && j <= e) {

            // <= keeps stability
            if (arr[i].marks <= arr[j].marks)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= e) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[s + x] = temp[x];
    }

    // ---------------- Quick Sort (UNSTABLE)
    // Unstable because pivot swapping changes order
    static void quickSort(Student[] arr, int s, int e) {

        if (s >= e) return;

        int p = partition(arr, s, e);

        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    static int partition(Student[] arr, int s, int e) {

        Student pivot = arr[e];

        int i = s - 1;

        for (int j = s; j < e; j++) {

            if (arr[j].marks < pivot.marks) {

                i++;

                Student t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        Student t = arr[i + 1];
        arr[i + 1] = arr[e];
        arr[e] = t;

        return i + 1;
    }

    public static void main(String[] args) {

        // Same marks used to check stability
        Student[] original = {
                new Student(50, "A"),
                new Student(40, "B"),
                new Student(50, "C"),
                new Student(30, "D")
        };

        // clone for each sort
        Student[] b = original.clone();
        Student[] i = original.clone();
        Student[] s = original.clone();
        Student[] m = original.clone();
        Student[] q = original.clone();

        bubble(b);
        insertion(i);
        selection(s);
        mergeSort(m, 0, m.length - 1);
        quickSort(q, 0, q.length - 1);

        System.out.println("Bubble (Stable)    " + Arrays.toString(b));
        System.out.println("Insertion (Stable) " + Arrays.toString(i));
        System.out.println("Selection (Unstable) " + Arrays.toString(s));
        System.out.println("Merge (Stable)     " + Arrays.toString(m));
        System.out.println("Quick (Unstable)   " + Arrays.toString(q));
    }
}
/* // Bubble Sort is STABLE
// Reason:
// It swaps only when left element > right element
// If two elements are equal, they are NOT swapped
// So original order of equal elements is preserved

// Insertion Sort is STABLE
// Reason:
// Elements are shifted, not swapped randomly
// Equal elements keep their relative order
// So original order is maintained

// Merge Sort is STABLE
// Reason:
// During merge, if elements are equal,
// left element is taken first (<= condition)
// So order of equal elements is preserved

// Selection Sort is UNSTABLE
// Reason:
// It swaps minimum element with first unsorted element
// This swap can change order of equal elements
// So original order is not preserved

// Quick Sort is UNSTABLE
// Reason:
// Pivot swapping moves elements across array
// Equal elements may change positions
// So relative order is not maintained

// Heap Sort is UNSTABLE
// Reason:
// Heap operations swap parent and child nodes
// Equal elements can move to different positions
// So original order is lost
 */