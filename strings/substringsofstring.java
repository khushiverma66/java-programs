
import java.util.*;

public class substringsofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
