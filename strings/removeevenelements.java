package strings;
//package strings;
import java.util.Scanner;

public class removeevenelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
           if(i%2==0){
            s1.deleteCharAt(i);
           }
        }
        System.out.println(s1.toString());
    }
}
