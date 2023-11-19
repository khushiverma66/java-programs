import java.lang.reflect.Array;
import java.util.*;
public class stringsak {
    public static void main(String[] args) {
        //palindrome
        // String str = "racecar";
        // for(int i=0;i<str.length()/2;i++){
        //     if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        //          System.out.println("false");;
        //     }
        // }
        // System.out.println("true");


        //dir&path
        // String path = "WNEENESENNN";
        // int x=0;
        // int y=0;
        // for(int i=0;i<path.length();i++){
        //     char dir = path.charAt(i);
        //     if(dir=='S'){
        //         y--;
        //     }
        //     else if(dir == 'N'){
        //         y++; 
        //     }
        //     else if(dir == 'W'){
        //         x--;
        //     }
        //     else{
        //         x++;
        //     }
        // }
        // int X2 = x*x;
        // int Y2 = y*y;
        // System.out.println((float)Math.sqrt(X2 + Y2));

        
        //substring
        //  String str = "HelloWorld";
        // // int si=0; //startingIndex
        // // int ei=5; //EndingIndex
        // // String substr = "";
        // // for(int i=si;i<ei;i++){
        // //     substr+=str.charAt(i)+" ";
        // // }
        // // System.out.println(substr);
        // OR
        // System.out.println(str.substring(0,5));


        //largest string
        // String fruits[]= {"apple","mango","banana"};
        // String largest=fruits[0];
        // for(int i=0;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest);

        //toUpperCase
        // String str = "hi, i am khushi";
        // StringBuilder sb = new StringBuilder("");
        // char ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);
        // for(int i=1;i<str.length();i++){
        //     if(str.charAt(i) == ' ' && i<str.length()-1){
        //         sb.append(str.charAt(i));
        //         i++;
        //         sb.append(Character.toUpperCase(str.charAt(i)));

        //     }else{
        //         sb.append(str.charAt(i));
        //     }
        // }
        // sb.toString();
        // System.out.println(sb);
        
        //String Compression
        // String str = "aaabbcccdd";
        // String newStr = "";
        // for(int i=0;i<str.length();i++){
        //     Integer count = 1;
        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newStr += str.charAt(i);
        //     if(count>1){
        //         newStr += count.toString();
        //     }
        // }
        // System.out.println(newStr);

        //number of lowercase vowels
        // String str = "abaecdue";
        // Integer count = 0;
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        //Anagrams
        // String str1="race";
        // String str2="care";
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        // if(str1.length()==str2.length()){
        //     char [] arr1 = str1.toCharArray();
        //     char [] arr2 = str2.toCharArray();
        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);
        //     boolean result = Arrays.equals(arr1,arr2);
        //     if(result){
        //         System.out.println(str1 + " and " + str2 + " are anagrams of each other");
        //     }
        //     else{
        //         System.out.println(str1 + " and " + str2 + "are not anagrams of each other");
        //     }
        // }
        // else{
        //     System.out.println(str1 + " and " + str2 + "are not anagrams of each other");
        // }

        //reverse string
        // String str = "geeks";
        // StringBuilder sb = new StringBuilder();
        // sb.append(str);
        // sb.reverse();
        // sb.toString();
        // System.out.println(sb);

        //reverse each string
    //    String str = "I am a star";
    //    String ans = "";
    //    StringBuilder s = new StringBuilder("");
    //    for(int i=0;i<str.length();i++){
    //     char ch = str.charAt(i);
    //     if(ch!=' '){
    //         s.append(ch);
    //     }
    //     else{
    //         s.reverse();
    //         ans += s;
    //         ans += " ";
    //         s = new StringBuilder("");
    //     }
    //    }
    //    s.reverse();
    //    ans += s;
    //    System.out.println(ans);

    //str1 in str2
    // String s1 = "for";
    // String s2 = "geeksforgeeks";
    // System.out.println(s2.contains(s1));

    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int asci = (int)s.charAt(i);
            //if(ch==' ')continue;
            if(asci<97){
              asci+=32;
            }
            str.append((char)asci);
        }
        System.out.println(str);
    }
}
