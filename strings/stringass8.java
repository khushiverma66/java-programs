//package strings;
import java.util.Scanner;

public class stringass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        str=str.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                str=str.append(s.charAt(i));
            }
            //str=str.append(s.charAt(i));
        }
        System.out.println(str); 
        }                                                  
    }