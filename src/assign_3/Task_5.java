package assign_3;
import java.util.Arrays;
public class Task_5 {
    public static void main(String[] args) {
        int[] arr = {23,35,81,60,26,90,21,74,79,37};
        Arrays.sort(arr);
        int target = 74;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println("Not found");
    }
}