package assign_1;

import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int c = scanner.nextInt();
        System.out.println(sumOFelements(arr,c));
    }
    public static int sumOFelements(int[] arr,int c){
        if (c==0){
            return 0;
        }
        return arr[c] + sumOFelements(arr,c-1);
    }
}
