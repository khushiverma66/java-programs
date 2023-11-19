import java.util.*;
public class alass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String>ll= new LinkedList<>();
        for(int i=0;i<n;i++){
            ll.add(sc.next());
        }
        System.out.println(ll);
        System.out.println("enter str:");
        String str = sc.next();
        for(int i=0;i<ll.size();i++){
            if((ll.get(i)).equals(str)){
                System.out.println(i);
                break;
            }
            else{
                if(i==ll.size()-1){
                System.out.println("it does not contain any substring");
                }
            }
        }

    }
}
