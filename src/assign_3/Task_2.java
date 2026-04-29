package assign_3;
import java.util.Arrays;
public class Task_2 {
    public static void main(String[] args) {
        int [] arr = {23,35,81,60,26,90,21,74,79,37};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
    static void merge(int[] arr, int l, int m, int r) {
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                t[k++] = arr[i++];
            } else {
                t[k++] = arr[j++];
            }
        }
        while (i <= m){
            t[k++] = arr[i++];
        }
        while (j <= r){
            t[k++] = arr[j++];
        }
        for (int x = 0; x < t.length; x++) {
            arr[l + x] = t[x];
        }
    }
}
