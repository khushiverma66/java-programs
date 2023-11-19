//package strings;
import java.util.Scanner;

public class stringass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //StringBuilder str = new StringBuilder("");
        char x = ' ';
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                x=s.charAt(i);
            }
            count=0;
        }
        System.out.println(x);
    }
}
