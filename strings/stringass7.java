//package strings;
import java.util.Scanner;
public class stringass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        char n = sc.nextLine().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==n){
                continue;
            }
            str.append(s.charAt(i));
        }
        System.out.println(str);
    }
}
