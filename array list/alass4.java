import java.util.*;

public class alass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>ll1=new LinkedList<>();
        LinkedList<Integer>ll2=new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ll1.add(sc.nextInt());
        }
        System.out.println(ll1);
        for(int j=0;j<n;j++){
            ll2.add(sc.nextInt());
        }
        System.out.println(ll2);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ll1.get(i)==ll2.get(j)){
                    System.out.println(ll1.get(i));
                }
                // else{
                //     System.out.println(ll1.get(i));
                // }
            }
        }
    }
}
