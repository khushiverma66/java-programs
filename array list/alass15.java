import java.util.*;
public class alass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        for(int i=0;i<=n;i++){
            for(int j=1;j<n+1;j++){
            if(al.get(i)==al.get(j)){
                al.remove(i);
            }
            System.out.println(al);    
        }
    }   

    }
}
