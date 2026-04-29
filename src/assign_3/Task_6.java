package assign_3;

public class Task_6 {

    public static void main(String[] args) {

        int[] arr = {23,35,81,60,26,90,21,74,79,37};
        int target = 26;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c++;
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                System.out.println("Comparisons: " + c);
                return;
            }
        }
        System.out.println("Not found");
    }
}