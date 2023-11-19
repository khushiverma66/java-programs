
import java.util.Scanner;

public class addsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String su = sc.nextLine();
        int n = sc.nextInt();
        StringBuilder s1 = new StringBuilder(s);
           s=s.substring(0, n) + su + s.substring(n);
           //s1=s1.insert(n, su) ;
        //System.out.println(s1.toString());
        System.out.println(s);
    }
}
