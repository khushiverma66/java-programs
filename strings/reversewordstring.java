//package strings;
import java.util.*;

public class reversewordstring {
    public static void main(String[] args) {
       String str = "I am a star";
       String ans = "";
       StringBuilder s = new StringBuilder("");
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch!=' '){
            s.append(ch);
        }
        else{
            s.reverse();
            ans += s;
            ans += " ";
            s = new StringBuilder("");
        }
       }
       s.reverse();
       ans += s;
       System.out.println(ans);
    }
}

