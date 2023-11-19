import java.util.Scanner;;
public class searchingin2darray {
    static void searching(int[][] arr,int r,int c){
        //int sum = 0;
        for(int i=0;i<r;i++){
            int x=0;
            for(int j=0;j<c;j++){
                //sum = sum + arr[i][j];
                x = x + arr[i][j];
                }
                System.out.println(x);
            }
        }
    static void colsum(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            int x = 0;
            for(int j=0;j<c;j++){
                //sum = sum + arr[i][j];
                x = x + arr[j][i];
                }
                System.out.println(x);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        searching(arr,r,c);
        colsum(arr,r,c);
        //System.out.println(ans);
    }
}
