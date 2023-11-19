//package strings;
import java.util.Scanner;

public class searchinginstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                System.out.println("yes it exists");
                break;
            }
            else if(i==s.length()-1){
                System.out.println("it doesn't");
                
            }
        } 
    }
}
