package assign_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the length element of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("target: ");
        int target = scanner.nextInt();
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Index: "+result[0] + " " + result[1]);
            System.out.println(nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("Solution does not exist!");
        }
        scanner.close();
    }
}
