
import java.util.Scanner;

public class stringass6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=s.length();i>s.length()-n;i--){
            s= s.substring(n)+s.substring(0, n);
        }
        System.out.println(s);
    }
}
