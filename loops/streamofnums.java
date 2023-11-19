package loops;
import java.util.Scanner;
public class streamofnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int sum=0;
        while(num!= -1){
            sum = sum + num;
            num = sc.nextInt();

        }
        System.out.println(sum);
    }    
}
