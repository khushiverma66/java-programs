//import java.util.Scanner;
public class swapalternate {
    static int[] swap(int[] arr){
        int n = arr.length;
        int temp=0;
        for(int i=0;i<n-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
        }
        return arr;
    }    
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,9,5};
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
