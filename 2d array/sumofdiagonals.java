import java.util.Scanner;

public class sumofdiagonals {
    static void diagonalBoundarysum(int[][] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==n-1){
                    sum+=arr[i][j];
                }
                else if(i==0 || j==0 || i==n-1 || j==n-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        diagonalBoundarysum(arr);

    }
}
