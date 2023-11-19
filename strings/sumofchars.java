package strings;
import java.util.Scanner;

public class sumofchars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                sum += s.charAt(i)-'A'+1;
            }
            else{
                sum += s.charAt(i)-'a'+1;
            }
        }
        System.out.println(sum);
    }
}
