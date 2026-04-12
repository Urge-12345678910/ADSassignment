package assign_1;

import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOFSquares(n));
    }
    public static int sumOFSquares(int n){
        if (n==1){
            return 1;
        }
        return n*n + sumOFSquares(n-1);
    }
}
