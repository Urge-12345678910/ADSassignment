package assign_1;

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        str(arr,0);
    }

    public static void str(char[] arr, int pos) {
        if (pos == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = pos; i < arr.length; i++) {
            char t = arr[pos];
            arr[pos] = arr[i];
            arr[i] = t;
            str(arr, pos + 1);
            t = arr[pos];
            arr[pos] = arr[i];
            arr[i] = t;
        }
    }
}
