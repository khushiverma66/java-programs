import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {10,1,7,6,14,9};
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap(arr[j],arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
