import java.util.*;
public class Pairsum1{
        static int sum(int[] arr, int target){
            int n = arr.length;
            int ans = 0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==target){
                        ans++;
                    }
                }
            }
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();  
        int yes=sum(arr,target);
        System.out.println(yes);

    }        
}
