import java.util.*;

public class anagrams {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length()==s2.length()){
        char [] s11 = s1.toCharArray();
        char [] s22 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        if(Arrays.equals(s11,s22)){
            System.out.println("yes they are anagrams");
        }
        else{
            System.out.println("no they are not");
        }
    }
    else{
        System.out.println("no they are not");
    }
   } 
}
