import java.util.Scanner;

public class largestsumin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c =sc.nextInt();
        int max=Integer.MIN_VALUE;
        int [][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        int sum=0;
        int q=0;
        String s = "";
        for(int i=0;i<r;i++){
            sum= 0;{
                for(int j=0;j<c;j++){
                    sum = sum + arr[i][j];
                }
                if(sum>max){
                    max = sum;
                    q = i;
                    s = "rows";
                }
            }
            System.out.println(s + " " + q + " " + max);
        }
        
    }
}
