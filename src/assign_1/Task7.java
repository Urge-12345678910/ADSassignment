package assign_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        zhylan(matrix, 0, n - 1, 0, n - 1, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int zhylan(int[][] matrix, int t, int b, int l, int r, int num) {
        if (t > b || l > r) {
            return num;
        }
        for (int i = l; i <= r; i++) {
            matrix[t][i] = num++;
        }
        t++;
        for (int i = t; i <= b; i++) {
            matrix[i][r] = num++;
        }
        r--;
        if (t <= b) {
            for (int i = r; i >= l; i--) {
                matrix[b][i] = num++;
            }
            b--;
        }
        if (l <= r) {
            for (int i = b; i >= t; i--) {
                matrix[i][l] = num++;
            }
            l++;
        }
        return zhylan(matrix, t, b, l, r, num);
    }
}
