package assign_1;

import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        nk(n, k, arr, 0);
    }

    public static void nk(int n, int k, int[] arr, int pos) {
        if (pos == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[pos] = i;
            nk(n, k, arr, pos + 1);
        }
    }
}
