//package strings;
import java.util.Scanner;

public class indexofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==ch){
                
        //         break;
        //     }
        // }

        System.out.println(s.indexOf(ch));
        }
}
