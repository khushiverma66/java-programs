
//package strings;
import java.util.*;
public class togglestrings {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str); 
        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);  
            if(ch==' ')continue;
            int ascii = (int)ch;
            if(ascii>=97) flag=false;
            if(flag==true){
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
            else{
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);*/
        String str = "PHysiCs";
        // Stringbuilder s = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ')continue;
            int asci = (int)ch;
            if(asci>=97) flag= false;
            if(flag==true){
                asci+=32;
                char dh = (char)asci;
                str = str.substring(0,i)+dh+str.substring(i+1);
            } 
            else{
                asci-=32;
                char dh = (char)asci;
                str = str.substring(0, i)+dh+str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
