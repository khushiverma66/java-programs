package loops;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}

