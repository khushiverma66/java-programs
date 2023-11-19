
import java.util.Scanner;

public class stringass2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    /*StringBuilder sbuff = new StringBuilder("");
    char c1 = sc.next().charAt(0);
    char c2 = sc.next().charAt(0);
    int i = 0;
    int j = s.length();    
    //char [] arr = s.toCharArray();                                                                                                                                                                                                                           
    for(i=0;i< j;i++){
        if(s.charAt(i)==c1){
            sbuff = sbuff.append(c2);
            continue;
        }
        else {
            sbuff.append(s.charAt(i));
        }
    }
    System.out.println(sbuff);*/
    char c1 = sc.next().charAt(0);
    char c2 = sc.next().charAt(0);
    System.out.println(s.replace(c1, c2));
   }
}
