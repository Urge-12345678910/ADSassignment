package assign_2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n for list:");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            al.add(scanner.nextInt());
        }
        int c=0;
        for (int j = al.size() - 1 ; j>=0; j--){
            if(al.get(j)==0){
                c++;
                al.remove(j);
            }
        }
        for (int b=0;b<c;b++){
            al.add(0);
        }
        System.out.println(al);
    }
}
