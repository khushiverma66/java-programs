import java.util.Scanner;
public class printarray {
    static void array(int[] arr,int n){
        int i;
        int num = 1;
        for(i=0;i<n;i++){
            if(num<=n){
                arr[i]=num;
                num=num+2;
            }
            else{
                break;
            }
        } 
            num = n;
            for(;i<n;i++){
                arr[i]=num;
                num= num-2;
            }
        }        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        array(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
