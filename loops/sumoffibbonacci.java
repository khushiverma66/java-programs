package loops;
import java.util.Scanner;
public class sumoffibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int sum = 1;
        if(n<=0){
            sum = 0;
        }
        int c = 1;
        for(int i=1;i<n;i++){
            a = b;
            b = c;
            c = a+b;
            sum = sum + c;
        }
        System.out.println(sum);
    }    
}
