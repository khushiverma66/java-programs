import java.util.*;
public class alcheckocc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <String>al=new LinkedList<>();
        for(int i=0;i<5;i++){
            al.add(sc.nextLine());
        }
        String n = sc.nextLine();
        Iterator<String> i = al.iterator();
        if(al.contains(n)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
