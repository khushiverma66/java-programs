package loops;
import java.util.Scanner;
public class fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting fah value:");
        int s = sc.nextInt();
        System.out.println("end fah value:");
        int e = sc.nextInt();
        System.out.println("enter gap value:");
        int w = sc.nextInt();
        int c;
        for(int i=s;i<=e;i+=w){
            c = (5*(i-32)/9);
            System.out.println(s+" "+c);
        }

    }    
}
