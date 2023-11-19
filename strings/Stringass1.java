
import java.util.Scanner;

public class Stringass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String gtr = s+"";
        if(str.equals(gtr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}    
