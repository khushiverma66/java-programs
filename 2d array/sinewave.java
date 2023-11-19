import java.util.Scanner;

public class sinewave {
    static void waveprint(int[][] arr,int r,int c){
        for(int j=0;j<c;j++){
            if(j%2==0){
                for(int i=0;i<r;i++){
                    System.out.print(arr[i][j]);
                }
            }
            else{
                for(int i=r-1;i>=0;i--){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c =sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        waveprint(arr, r, c);

    }
}

