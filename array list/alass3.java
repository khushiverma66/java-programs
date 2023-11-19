import java.util.*;

public class alass3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    String s = sc.nextLine();
    //String s= sc.next();
    char c = sc.next().charAt(0);
    char a = sc.next().charAt(0);
    ArrayList<Character>al=new ArrayList<Character>();
    for(int i=0;i<s.length();i++){
        al.add(s.charAt(i));
    }
    for(int i=0;i<al.size();i++){
        if(al.get(i)==c){
            al.set(i, a);
        }
    }
    System.out.println(al);
   } 
}
