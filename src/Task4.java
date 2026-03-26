import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(sumOFpow(n,c));
    }

    public static int sumOFpow(int n,int c){
        if (n==0){
            return 1;
        }
        int k=1;
        for (int i=1;i<=n;i++){
            k*=c;
        }
        return k + sumOFpow(n-1,c);
    }
}
