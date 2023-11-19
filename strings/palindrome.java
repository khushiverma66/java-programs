//package strings;
import java.util.*;
public class palindrome {
    public static boolean palindromicsubstrings(String str){
        int i=0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcdcba";
        //StringBuilder gtr = new StringBuilder(str);
        //gtr.reverse();
        //String s = gtr +"";
        //if(str.equals(s)){
        //    System.out.println("Palindrome");
        //}
        //else{
        //    System.out.println("not palindrome");
        //}
        /*int i =0;
        int j = str.length()-1;
        boolean flag= true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("palindrome");
        else System.out.println("not palindrome ");*/
        int count =0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(palindromicsubstrings(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
