import java.util.*;
public class alass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        int largest=al.get(n-1);
        int smallest=al.get(0);
        System.out.println("largest: "+largest);
        System.out.println("smallest: "+smallest);
    }
}
