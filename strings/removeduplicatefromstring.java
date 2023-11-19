//package strings;
import java.util.Scanner;

public class removeduplicatefromstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(str.indexOf(c)<0){
                str += c;
            }
        }
        System.out.println(str);
    }
}
