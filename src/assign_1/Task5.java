package assign_1;

import java.util.Scanner;
class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        inout(n,scanner);
    }

    public static void inout(int n, Scanner scanner){
        if (n==0){
            return;
        }
        int x = scanner.nextInt();
        inout(n-1,scanner);
        System.out.println(x);
    }
}
