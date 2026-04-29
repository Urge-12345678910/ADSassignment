package assign_2;
import java.util.LinkedList;
import java.util.Queue;
public class Task_4 {
    public static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String s1 = q.poll();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Binary numbers from 1 to " + n + ":");
        generateBinaryNumbers(n);
    }
}
