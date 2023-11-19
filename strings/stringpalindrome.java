//package strings;
import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String gtr = str + "";
        if(s.equals(gtr)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
