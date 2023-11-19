package loops;
import java.util.Scanner;
public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            i=n%10;
            n=n/10;
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
            
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
