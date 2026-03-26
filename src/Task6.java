import java.util.Scanner;
class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        inout(n,scanner);
    }

    public static void inout(int n, Scanner scanner){
        if (n==0){
            return;
        }
        char[] s = scanner.nextLine().toCharArray();
        inout(n-1,scanner);
        System.out.println(new String(s));
    }
}
