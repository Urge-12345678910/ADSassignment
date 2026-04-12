package assign_1;

import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOFnatural(n));
    }
    public static int sumOFnatural(int n){
        if (n==0){
            return 0;
        }
        return n + sumOFnatural(n-1);
    }
}
