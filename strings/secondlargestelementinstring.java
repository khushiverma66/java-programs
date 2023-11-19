
import java.util.*;

public class secondlargestelementinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] x = new char[s.length()];
        String str = "";
        // for(int i=0;i<s.length();i++){
        //     char ch  = s.charAt(i);
        //     if(str.indexOf(ch)<0){
        //         str += ch;
        //     }
        // }
        x=s.toCharArray();
        Arrays.sort(x);
        System.out.println(x[x.length-2]);
        
    }
}
