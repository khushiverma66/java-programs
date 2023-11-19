
import java.util.Scanner;

public class stringass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int asci = (int)s.charAt(i);
            //if(ch==' ')continue;
            if(asci<97){
              asci+=32;
            }
            str.append((char)asci);
        }
        System.out.println(str);
    }
}
