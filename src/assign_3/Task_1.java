package assign_3;

public class Task_1 {
    public static void main(String[] args) {
        boolean s=false;
        int [] arr = {23,35,81,60,26,90,21,74,79,37};
        for (int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
