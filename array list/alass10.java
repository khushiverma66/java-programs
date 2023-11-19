import java.util.*;

public class alass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String>list=new LinkedList <>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        String s = sc.next();
        int position = sc.nextInt();
        list.add(position,s);
        System.out.println(list);
    }
}
