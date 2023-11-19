
import java.util.*;
public class alass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        int e= al.get(n-2);
        System.out.println(e);
    }
}
