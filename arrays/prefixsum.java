import java.util.Scanner;

public class prefixsum {
    static int[] prefix(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[0]+arr[i];
        }
        return pref;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
    }
    int[] pref = prefix(arr);
    printArray(pref);
}
}
