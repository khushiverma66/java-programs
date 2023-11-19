package loops;
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        /*if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("The no. is divisible by 3 or 5 but not 15");
            }
            else{
                System.out.println("not matching");
            }
        }
        else{
            System.out.println("not matching");
        }*/
        if(n%5==0 || n%3==0 && n%15!=0){
            System.out.println("the no.is divisible by 5 or 3 but not 15");
        }
        else{
            System.out.println("not matching the required condition");
        }
    
    }    
}
