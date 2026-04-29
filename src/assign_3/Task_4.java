package assign_3;
import java.util.Arrays;
public class Task_4 {
    static int M = 7;
    static Integer[] table = new Integer[M];
    public static void main(String[] args) {
        int[] arr = {23,35,81,60,26,90,21,74,79,37};
        for (int k : arr) {
            insert(k);
        }
        printTable();
    }
    static void insert(int k) {
        int index = k % M;
        int start = index;
        while (table[index] != null) {
            index = (index + 1) % M;
            if (index == start) {
                System.out.println("Table is full, cannot insert: " + k);
                return;
            }
        }
        table[index] = k;
    }
    static void printTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < M; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }
}
