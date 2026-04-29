package assign_3;
import java.util.Arrays;
public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {23,35,81,60,26,90,21,74,79,37};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, low, i - 1);
        return i - 1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}