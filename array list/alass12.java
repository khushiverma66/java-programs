import java.util.*;

public class alass12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            if((al.get(i)%2)==0){
                al.remove(i);
                i--;
            }
            //System.out.println(al);
        }
        System.out.println(al);
    }
}
