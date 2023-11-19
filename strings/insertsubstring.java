import java.util.Scanner;

public class insertsubstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String su = sc.nextLine();
        int n = sc.nextInt();
            s=s.substring(0,n)+ su + s.substring(n);
            System.out.println(s);
    }
}
