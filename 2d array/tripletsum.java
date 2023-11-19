import java.util.*;
public class tripletsum {
    static void triplet(int[] arr,int sum){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = sc.nextInt();
        triplet(arr, sum);
        
    }
}
