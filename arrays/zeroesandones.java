import java.util.*;

public class zeroesandones {
    static void print(int [] arr){
        System.out.println("array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void arr(int[]arr,int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr(arr,n);
        print(arr);
    }
}
