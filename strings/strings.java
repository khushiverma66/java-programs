package strings;
import java.util.Scanner;
import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Khushi";
       // System.out.println(str);
        //String s = sc.nextLine(); 
        //int len = s.length();
       // System.out.println(len);
        System.out.println(str.charAt(3));     
        System.out.println(str.indexOf('h'));
        String dtr = "rony";
        System.out.println(str.compareTo(dtr));
        System.out.println(str.contains("ush"));
        System.out.println(str.startsWith("kh"));
        System.out.println(str.endsWith("hi"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String x=str.concat(dtr);
        System.out.println(x);
        System.out.println(str.concat(dtr));
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(2));
    }
}
